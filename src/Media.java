abstract class Media {
    private String titre;
    private int anneePublication;

    // Constructeur par défaut
    public Media() {
        this.titre = "";
        this.anneePublication = 0;
    }

    // Constructeur avec paramètres
    public Media(String titre, int anneePublication) {
        this.titre = titre;
        this.anneePublication = anneePublication;
    }

    public String getTitre() {
        return titre;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    // Méthode abstraite à redéfinir dans les classes filles
    public abstract String getDescription();

    // Méthode afficherDetails pour le polymorphisme
    public void afficherDetails() {
        System.out.println(this.toString());
        System.out.println(this.getDescription());
    }

    @Override
    public String toString() {
        return titre + " (" + anneePublication + ")";
    }
}

