import java.util.List;

// Classe pour démontrer le filtrage
class Filtrage {

    // Filtrer les médias publiés après une certaine année
    public static List<Media> filtrerParAnnee(List<Media> medias, int anneeMin) {
        return Utilitaires.filtrer(medias, m -> m.getAnneePublication() > anneeMin);
    }

    // Filtrer uniquement les livres
    public static List<Media> filtrerLivres(List<Media> medias) {
        return Utilitaires.filtrer(medias, m -> m instanceof Livre);
    }

    // Filtrer uniquement les CD
    public static List<Media> filtrerCD(List<Media> medias) {
        return Utilitaires.filtrer(medias, m -> m instanceof CD);
    }

    // Filtrer les livres d'un auteur spécifique
    public static List<Media> filtrerParAuteur(List<Media> medias, String auteur) {
        return Utilitaires.filtrer(medias,
                m -> m instanceof Livre && ((Livre)m).getAuteur().equals(auteur));
    }
}