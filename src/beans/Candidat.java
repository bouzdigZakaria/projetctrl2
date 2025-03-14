package beans;
public class Candidat {
    private int id;
    private String nom;
    private String prenom;
    private String diplome;
    private String mention;

    public Candidat(int id, String nom, String prenom, String diplome, String mention) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.diplome = diplome;
        this.mention = mention;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
}
