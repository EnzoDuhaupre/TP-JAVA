import java.util.*;

// Classe pour gérer les collections
class GestionCollection {

    // Copier une collection dans une autre
    public static <T> void copierCollection(Collections<T> source, Collections<T> destination) {
        for (T element : source) {
            destination.add(element);
        }
    }

    // Récupérer tous les médias empruntés sans doublons
    public static Set<Media> getMediasEmpruntes(Map<Membre, List<Media>> emprunts) {
        Set<Media> mediasUniques = new HashSet<>();
        // On parcourt toutes les listes d'emprunts
        for (List<Media> listeEmprunts : emprunts.values()) {
            mediasUniques.addAll(listeEmprunts);
        }
        return mediasUniques;
    }
}
