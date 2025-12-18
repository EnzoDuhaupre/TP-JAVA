import java.util.*;

// Classe principale pour gérer la bibliothèque
class Bibliotheque {
    private List<Media> medias;
    private Set<Membre> membres;
    private Map<Membre, List<Media>> emprunts;

    public Bibliotheque() {
        this.medias = new ArrayList<>();
        this.membres = new HashSet<>();
        this.emprunts = new HashMap<>();
    }

    public void ajouterMedia(Media media) {
        medias.add(media);
    }

    public void ajouterMembre(Membre membre) {
        membres.add(membre);
        // On initialise la liste d'emprunts pour ce membre
        emprunts.put(membre, new ArrayList<>());
    }

    public void enregistrerEmprunt(Membre membre, Media media) {
        membre.emprunterMedia(media);
        // On met à jour la map des emprunts
        if (emprunts.containsKey(membre)) {
            emprunts.get(membre).add(media);
        }
    }

    // Initialiser avec les médias de base
    public void initialiserMedias() {
        ajouterMedia(new Livre("La Horde du Contrevent", 2004, "Alain Damasio", 736));
        ajouterMedia(new Livre("Les Furtifs", 2019, "Alain Damasio", 704));
        ajouterMedia(new Livre("Gagner la guerre", 2009, "Jean-Philippe Jaworski", 650));
        ajouterMedia(new CD("Civilisation", 2021, "Orelsan", 77));
        ajouterMedia(new CD("La fête est finie", 2017, "Orelsan", 72));
    }

    public List<Media> getMedias() {
        return medias;
    }

    public Set<Membre> getMembres() {
        return membres;
    }

    public Map<Membre, List<Media>> getEmprunts() {
        return emprunts;
    }
}