public class StudentModel {
    private String name;

    // Constructor
    public StudentModel(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Método para mostrar el nombre del estudiante
    public void displayName() {
        System.out.println("Student Name: " + name);
    }
}
