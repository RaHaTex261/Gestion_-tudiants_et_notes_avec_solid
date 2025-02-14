package Main;

public class Main {
    public static void main(String[] args) {
        // Création du premier étudiant avec son identifiant, nom et prénom
        Student student1 = new Student("261", "Ranto", "Teddy");
        
        // Ajout des notes pour le premier étudiant
        student1.ajouterNote(new Note("EPS", 20));      // Note en EPS
        student1.ajouterNote(new Note("Arts plastiques", 19));  // Note en Arts plastiques

        // Création du deuxième étudiant avec son identifiant, nom et prénom
        Student student2 = new Student("102", "Test", "Essaye");
        
        // Ajout des notes pour le deuxième étudiant
        student2.ajouterNote(new Note("Math", 0));      // Note en Mathématiques
        student2.ajouterNote(new Note("Anglais", 9));   // Note en Anglais

        // Configuration de la persistance MySQL
        Database mySQLDatabase = new MysqlDatabase();
        StudentService studentService1 = new StudentService(mySQLDatabase);
        studentService1.saveStudent(student1);  // Sauvegarde du premier étudiant en MySQL

        // Configuration de la persistance en fichier
        Database fileDatabase = new FileDatabase();
        StudentService studentService2 = new StudentService(fileDatabase);
        studentService2.saveStudent(student2);  // Sauvegarde du deuxième étudiant en fichier
    }
}