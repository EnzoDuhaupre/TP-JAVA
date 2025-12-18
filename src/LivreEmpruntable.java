// Livre qui peut être emprunté
class LivreEmpruntable extends MediaEmpruntable {
    private String auteur;
    private int nbPages;

    public LivreEmpruntable(String titre, int anneePublication, String auteur, int nbPages) {
        super(titre, anneePublication);
        this.auteur = auteur;
        this.nbPages = nbPages;
    }

    public String getAuteur() {
        return auteur;
    }

    @Override
    public String getDescription() {
        return "Livre de " + auteur + ", " + nbPages + " pages.";
    }

    @Override
    public void emprunter() {
        System.out.println("Le livre '" + getTitre() + "' de " + auteur + " a été emprunté.");
    }
}