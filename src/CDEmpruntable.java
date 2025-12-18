// CD qui peut être emprunté
class CDEmpruntable extends MediaEmpruntable {
    private String artiste;
    private int duree;

    public CDEmpruntable(String titre, int anneePublication, String artiste, int duree) {
        super(titre, anneePublication);
        this.artiste = artiste;
        this.duree = duree;
    }

    public String getArtiste() {
        return artiste;
    }

    @Override
    public String getDescription() {
        return "CD de " + artiste + ", durée : " + duree + " min.";
    }

    @Override
    public void emprunter() {
        System.out.println("Le CD '" + getTitre() + "' de " + artiste + " a été emprunté.");
    }
}