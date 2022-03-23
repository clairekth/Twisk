/**
 * Classe abstraite représentant une étape du monde.
 *
 * @author Kurth Claire et Dallé Victor
 * @since 02/02/2022
 */
package twisk.monde;

import twisk.outils.FabriqueNumero;

import java.util.Iterator;

public abstract class Etape implements Iterable<Etape> {
    /**
     * Champs contenant le numéro de l'étape.
     */
    protected int numEtape;
    /**
     * Champs contenant le nom de l'étape.
     */
    protected String nom;
    /**
     * Champs contenant le gestionnaire des successeurs de l'étape actuelle.
     */
    protected GestionnaireSuccesseur gestionnaireSuccesseur;

//  Constructeur
    /**
     * Constructeur de la classe.
     *
     * @param nom Nom de l'étape.
     */
    public Etape(String nom) {
        this.nom = nom;
        gestionnaireSuccesseur = new GestionnaireSuccesseur();
        numEtape = FabriqueNumero.getInstance().getNumeroEtape();
    }

//  Getters
    /**
     * Méthode qui donne le nombre de successeurs de l'étape actuelle.
     *
     * @return Le nombre de successeurs.
     */
    public int nbSuccesseurs() {
        return gestionnaireSuccesseur.nbEtapes();
    }

    /**
     * Méthode qui vérifie si l'étape est une activité.
     *
     * @return Un booléen indiquant si c'est une activité ou non.
     */
    public boolean estUneActivite() {
        return false;
    }

    /**
     * Méthode qui vérifie si l'étape est un guichet.
     *
     * @return Un booléen indiquant si c'est un guichet ou non.
     */
    public boolean estUnGuichet() {
        return false;
    }

    /**
     * Méthode qui vérifie si l'étape est une sortie.
     *
     * @return Un booléen indiquant si c'est une sortie ou non.
     */
    public boolean estUneSortie() {
        for (Etape etape : gestionnaireSuccesseur) {
            if (etape.getNom().equalsIgnoreCase("sortie")) {
                return true;
            }
        }
        return false;
    }

    /**
     * Getter du nom de l'activité.
     *
     * @return Le nom.
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Getter du numéro de l'étape.
     *
     * @return Le numéro de l'étape.
     */
    public int getNumEtape() {
        return numEtape;
    }

    /**
     * Getter abstrait donnant le nombre de jetons.
     *
     * @return Nombre de jetons.
     */
    public abstract int getNbJetons();

//  Setters

    /**
     * Méthode qui ajoute un successeur à l'étape actuelle.
     *
     * @param etapes Les étapes successeures.
     */
    public void ajouterSuccesseur(Etape... etapes) {
        gestionnaireSuccesseur.ajouter(etapes);
    }

// Autres méthodes

    /**
     * Méthode définissant un nouvel itérateur pour Etape
     *
     * @return Le nouvel itérateur
     */
    @Override
    public Iterator<Etape> iterator() {
        return gestionnaireSuccesseur.iterator();
    }

    /**
     * Méthode toString().
     *
     * @return Les champs constituant l'étape.
     */
    @Override
    public String toString() {
        return this.nom + " : " + nbSuccesseurs() + " successeur(s) " + gestionnaireSuccesseur.toString();
    }

    /**
     * Méthode abstraite définissant le code c à ajouter pour une étape.
     *
     * @return Le code c.
     */
    public abstract String toC();
}