package test;
import beans.*;
import services.GestionCandidatures;
public class Main {
    public static void main(String[] args) {
        GestionCandidatures gestion = new GestionCandidatures();

        Master master1 = new Master(1, "Informatique", "Sciences", 30);
        gestion.ajouterMaster(master1);

        Candidat candidat1 = new Candidat(1, "Dupont", "Jean", "Licence Informatique", "Bien");
        Candidat candidat2 = new Candidat(2, "Martin", "Sophie", "Licence Mathématiques", "Très Bien");
        Candidature candidature1 = new Candidature(1, master1.getId(), candidat1.getId(), "En attente");
        gestion.enregistrerCandidature(candidature1);

        Candidat recherche = gestion.rechercherCandidat("Dupont");
        if (recherche != null) {
            System.out.println("Candidat trouvé: " + recherche.getNom() + " " + recherche.getPrenom());
        } else {
            System.out.println("Candidat non trouvé.");
        }
    }
}
