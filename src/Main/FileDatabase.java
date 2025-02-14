package Main;

public class FileDatabase implements Database {
    @Override
    public void saveStudent(Student student) {
        System.out.println("Sauvegarde dans fichier : " + student.getName());
        // Affichage des notes
        student.getNotes().forEach(note ->
            System.out.println("  - " + note.getMatiere() + " : " + note.getValeur()));
    }
}