package twisk.outils;

public class ExemplesDeMondes {
    public static ExemplesDeMondes instance = new ExemplesDeMondes();

    private ExemplesDeMondes() {}

    public static ExemplesDeMondes getInstance() {
        return instance;
    }

    public String bifurcations() {
        return "{\"EtapesIG\":[{\"Nom\":\"in\",\"ID\":\"etape0\",\"PosX\":545,\"PosY\":10,\"Delai\":3,\"Ecart\":2,\"Type\":\"Activité\",\"Entree\":\"oui\",\"Sortie\":\"non\"},{\"Nom\":\"out\",\"ID\":\"etape2\",\"PosX\":730,\"PosY\":424,\"Delai\":3,\"Ecart\":2,\"Type\":\"Activité\",\"Entree\":\"non\",\"Sortie\":\"oui\"},{\"Nom\":\"act3\",\"ID\":\"etape1\",\"PosX\":400,\"PosY\":339,\"Delai\":3,\"Ecart\":2,\"Type\":\"Activité\",\"Entree\":\"non\",\"Sortie\":\"non\"},{\"Nom\":\"act4\",\"ID\":\"etape4\",\"PosX\":125,\"PosY\":446,\"Delai\":3,\"Ecart\":2,\"Type\":\"Activité\",\"Entree\":\"oui\",\"Sortie\":\"non\"},{\"Nom\":\"act1\",\"ID\":\"etape3\",\"PosX\":234,\"PosY\":119,\"Delai\":3,\"Ecart\":2,\"Type\":\"Activité\",\"Entree\":\"non\",\"Sortie\":\"non\"},{\"Nom\":\"act2\",\"ID\":\"etape5\",\"PosX\":842,\"PosY\":131,\"Delai\":3,\"Ecart\":2,\"Type\":\"Activité\",\"Entree\":\"non\",\"Sortie\":\"non\"}],\"Arcs\":[{\"Pt1ID\":\"etape0@pt-ctrl2\",\"Pt1EtapeID\":\"etape0\",\"Pt2ID\":\"etape3@pt-ctrl0\",\"Pt2EtapeID\":\"etape3\"},{\"Pt1ID\":\"etape0@pt-ctrl3\",\"Pt1EtapeID\":\"etape0\",\"Pt2ID\":\"etape5@pt-ctrl0\",\"Pt2EtapeID\":\"etape5\"},{\"Pt1ID\":\"etape5@pt-ctrl1\",\"Pt1EtapeID\":\"etape5\",\"Pt2ID\":\"etape2@pt-ctrl0\",\"Pt2EtapeID\":\"etape2\"},{\"Pt1ID\":\"etape3@pt-ctrl1\",\"Pt1EtapeID\":\"etape3\",\"Pt2ID\":\"etape1@pt-ctrl0\",\"Pt2EtapeID\":\"etape1\"},{\"Pt1ID\":\"etape3@pt-ctrl1\",\"Pt1EtapeID\":\"etape3\",\"Pt2ID\":\"etape4@pt-ctrl0\",\"Pt2EtapeID\":\"etape4\"},{\"Pt1ID\":\"etape4@pt-ctrl3\",\"Pt1EtapeID\":\"etape4\",\"Pt2ID\":\"etape2@pt-ctrl2\",\"Pt2EtapeID\":\"etape2\"},{\"Pt1ID\":\"etape1@pt-ctrl3\",\"Pt1EtapeID\":\"etape1\",\"Pt2ID\":\"etape2@pt-ctrl2\",\"Pt2EtapeID\":\"etape2\"}]}";
    }

    public String guichets() {
        return "{\"EtapesIG\":[{\"Nom\":\"in\",\"ID\":\"etape0\",\"PosX\":61,\"PosY\":240,\"Delai\":3,\"Ecart\":2,\"Type\":\"Activité\",\"Entree\":\"oui\",\"Sortie\":\"non\"},{\"Nom\":\"guichetHaut\",\"ID\":\"etape2\",\"PosX\":411,\"PosY\":69,\"Jetons\":2,\"Type\":\"Guichet\",\"Entree\":\"non\",\"Sortie\":\"non\"},{\"Nom\":\"guichetBas\",\"ID\":\"etape1\",\"PosX\":429,\"PosY\":362,\"Jetons\":2,\"Type\":\"Guichet\",\"Entree\":\"non\",\"Sortie\":\"non\"},{\"Nom\":\"outHaut\",\"ID\":\"etape4\",\"PosX\":712,\"PosY\":65,\"Delai\":3,\"Ecart\":2,\"Type\":\"Activité\",\"Entree\":\"non\",\"Sortie\":\"oui\"},{\"Nom\":\"outBas\",\"ID\":\"etape3\",\"PosX\":758,\"PosY\":372,\"Delai\":3,\"Ecart\":2,\"Type\":\"Activité\",\"Entree\":\"non\",\"Sortie\":\"oui\"}],\"Arcs\":[{\"Pt1ID\":\"etape0@pt-ctrl3\",\"Pt1EtapeID\":\"etape0\",\"Pt2ID\":\"etape2@pt-ctrl0\",\"Pt2EtapeID\":\"etape2\"},{\"Pt1ID\":\"etape0@pt-ctrl3\",\"Pt1EtapeID\":\"etape0\",\"Pt2ID\":\"etape1@pt-ctrl0\",\"Pt2EtapeID\":\"etape1\"},{\"Pt1ID\":\"etape1@pt-ctrl1\",\"Pt1EtapeID\":\"etape1\",\"Pt2ID\":\"etape3@pt-ctrl2\",\"Pt2EtapeID\":\"etape3\"},{\"Pt1ID\":\"etape2@pt-ctrl1\",\"Pt1EtapeID\":\"etape2\",\"Pt2ID\":\"etape4@pt-ctrl2\",\"Pt2EtapeID\":\"etape4\"}]}";
    }
}
