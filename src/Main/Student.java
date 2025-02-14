package Main;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;
    private String name;
    private List<Note> notes;

    // Constructeur avec trois paramètres
    public Student(String id, String name, String prenom) {
        this.id = id;
        this.name = name;
        this.notes = new ArrayList<>();
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Note> getNotes() {
        return notes;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Méthode pour ajouter une note
    public void ajouterNote(Note note) {
        notes.add(note);
    }
}