// Interface pour les objets qui peuvent être empruntés
interface Empruntable {
    void emprunter();
}

// Classe abstraite qui combine Media et Empruntable
abstract class MediaEmpruntable extends Media implements Empruntable {

    public MediaEmpruntable(String titre, int anneePublication) {
        super(titre, anneePublication);
    }

    // Implémentation par défaut de emprunter()
    @Override
    public void emprunter() {
        System.out.println("Le média '" + getTitre() + "' a été emprunté.");
    }
}
