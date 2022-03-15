package twisk.simulation;

import twisk.monde.Etape;
import twisk.monde.Monde;
import twisk.outils.KitC;

public class Simulation {
    public native int[] start_simulation(int nbEtapes, int nbGuichets, int nbClients, int[] tabJetonsGuichet);

    public native void nettoyage();

    public native int[] ou_sont_les_clients(int nbEtapes, int nbClients);

    private KitC kit;

    public Simulation() {
        kit = new KitC();
        kit.creerEnvironnement();
    }

    public void simuler(Monde monde) {
        System.out.println(monde.toString());
        kit.creerFichier(monde.toC());
        kit.compiler();
        kit.construireLaLibrairie();
        System.load("/tmp/twisk/libTwisk.so");



        int nb_etapes = monde.nbEtapes() +1;
        int nb_guichets = 1;
        int nb_clients = 2;

        int[] tab_jetons_guichet = new int[nb_guichets];
        int j =0;

        for (Etape e:monde){
            if (e.estUnGuichet()){
                tab_jetons_guichet[j] = e.getNbJetons();
                j++;
            }
        }

        int[] tab = start_simulation(nb_etapes, nb_guichets, nb_clients, tab_jetons_guichet);
        int[] tab_client = ou_sont_les_clients(nb_etapes, nb_clients);

        // Affichage des PID des clients
        System.out.print("les clients : ");
        for (int i = 0; i < nb_clients; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        // Affichage des PID des clients par étape
        while (tab_client[(nb_clients + 1)] != nb_clients) {
            tab_client = ou_sont_les_clients(nb_etapes, nb_clients);
            int decalage = 0;
            int nb_a_afficher = tab_client[0];
            for (Etape e : monde) {
                System.out.print("Etape " + e.getNumEtape() + " " + e.getNom() + " - nb clients : " + nb_a_afficher + " - ");
                for (int i = decalage + 1; i < decalage + 1 + nb_a_afficher; i++) {
                    System.out.print(tab_client[i] + " ");
                }
                System.out.println();
                decalage += nb_clients + 1;
                nb_a_afficher = tab_client[decalage];

            }
        }
        nettoyage();
    }
}
