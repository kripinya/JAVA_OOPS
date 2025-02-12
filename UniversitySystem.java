//third_lab4

class University {

    private static String universityName = "Global University";
    private String studentName;

    public University(String studentName) {
        this.studentName = studentName;
    }

    public static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + this.studentName);
        System.out.println("University: " + universityName);
    }
}

public class UniversitySystem {

    public static void main(String[] args) {

        University.displayUniversityName();
        University student1 = new University("Alice Johnson");
        University student2 = new University("Bob Smith");
        University student3 = new University("Charlie Brown");
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
    }
}
