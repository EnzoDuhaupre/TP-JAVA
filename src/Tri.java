import java.util.*;

// Classe pour démontrer le tri
class Tri {

    // Trier les médias par année décroissante
    public static void trierParAnnee(List<Media> medias) {
        medias.sort(new TriParAnnee());
    }

    // Trier les livres par auteur
    public static void trierParAuteur(List<Livre> livres) {
        livres.sort(new TriParAuteur());
    }

    // Extraire et trier les livres d'une liste de médias
    public static List<Livre> extraireLivresTries(List<Media> medias) {
        List<Livre> livres = new ArrayList<>();
        for (Media m : medias) {
            if (m instanceof Livre) {
                livres.add((Livre) m);
            }
        }
        trierParAuteur(livres);
        return livres;
    }
}