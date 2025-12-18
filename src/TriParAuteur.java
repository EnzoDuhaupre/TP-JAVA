import java.util.Comparator;

// Comparateur pour trier les livres par auteur puis titre
class TriParAuteur implements Comparator<Livre> {
    @Override
    public int compare(Livre l1, Livre l2) {
        // Tri par auteur
        int compareAuteur = l1.getAuteur().compareTo(l2.getAuteur());
        if (compareAuteur != 0) {
            return compareAuteur;
        }
        // Si même auteur, tri par titre
        return l1.getTitre().compareTo(l2.getTitre());
    }
}