import java.util.*;

// Classe pour l'utilisation des collections
class Collections {

    // Afficher les informations sur les collections
    public static void afficherInfosCollections(Bibliotheque biblio) {
        System.out.println("=== Informations Collections ===");
        System.out.println("Nombre de médias (List) : " + biblio.getMedias().size());
        System.out.println("Nombre de membres (Set) : " + biblio.getMembres().size());
        System.out.println("Nombre d'emprunts (Map) : " + biblio.getEmprunts().size());
    }

    // Copier la liste de médias
    public static List<Media> copierMedias(List<Media> medias) {
        List<Media> copie = new ArrayList<>();
        GestionCollection.copierCollection(medias, copie);
        return copie;
    }

    // Obtenir tous les médias empruntés (sans doublons)
    public static Set<Media> obtenirMediasEmpruntes(Bibliotheque biblio) {
        return GestionCollection.getMediasEmpruntes(biblio.getEmprunts());
    }
}
