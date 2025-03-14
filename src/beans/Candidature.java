package beans;
public class Candidature {
private int id;
private int masterId;
private int candidatId;
private String statut;
    public Candidature(int id, int masterId, int candidatId, String statut) {
        this.id = id;
        this.masterId = masterId;
        this.candidatId = candidatId;
        this.statut = statut;
    }

    public int getId() { return id; }
    public int getMasterId() { return masterId; }
    public int getCandidatId() { return candidatId; }
}
