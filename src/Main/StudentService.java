package Main;

public class StudentService {
    private Database database;

    public StudentService(Database database) {
        this.database = database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public void saveStudent(Student student) {
        database.saveStudent(student);
    }
}