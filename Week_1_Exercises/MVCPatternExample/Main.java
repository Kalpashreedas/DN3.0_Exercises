package MVCPatternExample;

public class Main {
    public static void main(String[] args) {
        // Create a Student object (Model)
        Student student = new Student("Alice", "001", "A");

        // Create a StudentView object (View)
        StudentView view = new StudentView();

        // Create a StudentController object (Controller)
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Bob");
        controller.setStudentId("002");
        controller.setStudentGrade("B");

        // Display updated student details
        controller.updateView();
    }
}
