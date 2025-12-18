import java.util.List;

// Classe pour démontrer le polymorphisme
class Polymorphisme {

    // Afficher les détails de tous les médias (polymorphisme)
    public static void afficherDetailsPolymorphe(List<Media> medias) {
        System.out.println("=== Affichage polymorphe ===");
        for (Media media : medias) {
            media.afficherDetails(); // Appel polymorphe
            System.out.println();
        }
    }

    // Démonstration avec l'interface Empruntable
    public static void demonstrationEmpruntable() {
        System.out.println("=== Démonstration Empruntable ===");

        LivreEmpruntable livre = new LivreEmpruntable(
                "Aucun souvenir assez solide", 2012, "Alain Damasio", 544);
        livre.emprunter();

        CDEmpruntable cd = new CDEmpruntable(
                "Fantôme", 2023, "Orelsan", 68);
        cd.emprunter();

        // Polymorphisme avec MediaEmpruntable
        MediaEmpruntable media = new LivreEmpruntable(
                "La Zone du Dehors", 1999, "Alain Damasio", 518);
        media.emprunter();
    }
}
