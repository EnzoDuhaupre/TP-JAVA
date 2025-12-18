import java.util.*;
import java.util.function.Predicate;

// Classe avec des méthodes utilitaires génériques
class Utilitaires {

    // Méthode générique pour afficher une liste
    public static <T> void afficherListe(List<T> liste) {
        for (T element : liste) {
            System.out.println(element.toString());
        }
    }

    // Méthode générique pour filtrer avec un prédicat
    public static <T> List<T> filtrer(List<T> liste, Predicate<T> critere) {
        List<T> resultat = new ArrayList<>();
        for (T element : liste) {
            if (critere.test(element)) {
                resultat.add(element);
            }
        }
        return resultat;
    }
}
