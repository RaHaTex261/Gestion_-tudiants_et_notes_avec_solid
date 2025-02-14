package Main;

public class MysqlDatabase implements Database {
    @Override
    public void saveStudent(Student student) {
        System.out.println("Sauvegarde dans MySQL : " + student.getName());
        // Affichage des notes
        student.getNotes().forEach(note ->
            System.out.println("  - " + note.getMatiere() + " : " + note.getValeur()));
    }
}