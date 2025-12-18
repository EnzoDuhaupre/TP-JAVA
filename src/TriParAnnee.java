import java.util.Comparator;

// Comparateur pour trier les médias par année (décroissante) puis titre
class TriParAnnee implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        // Tri par année décroissante (du plus récent au plus ancien)
        int compareAnnee = Integer.compare(m2.getAnneePublication(), m1.getAnneePublication());
        if (compareAnnee != 0) {
            return compareAnnee;
        }
        // Si même année, tri par titre
        return m1.getTitre().compareTo(m2.getTitre());
    }
}