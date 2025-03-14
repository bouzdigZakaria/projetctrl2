package beans;
public class Master {
private int id;
private String intitule;
private String filiere;
private int placesDisponibles;
    public Master(int id, String intitule, String filiere, int placesDisponibles) {
        this.id = id;
        this.intitule = intitule;
        this.filiere = filiere;
        this.placesDisponibles = placesDisponibles;
    }
    public int getId() { return id; }
    public String getIntitule() { return intitule; }
    public String getFiliere() { return filiere; }
    public int getPlacesDisponibles() { return placesDisponibles; }
    public void setPlacesDisponibles(int placesDisponibles) { 
    	this.placesDisponibles = placesDisponibles; }
    }
