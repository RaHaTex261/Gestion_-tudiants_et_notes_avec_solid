package Main;

public class Note {
    private String matiere;
    private double valeur;

    public Note(String matiere, double valeur) {
        this.matiere = matiere;
        this.valeur = valeur;
    }

    // Getters
    public String getMatiere() {
        return matiere;
    }

    public double getValeur() {
        return valeur;
    }
}