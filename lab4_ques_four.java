//ques_four_lab4

class Course {

    String CourseName;
    int CourseCode;

    void CourseName(String CourseName) {
        this.CourseName = CourseName;
        System.out.println(CourseName);
    }

    void CourseCode(int CourseCode) {
        this.CourseCode = CourseCode;
        System.out.println(CourseCode);
    }
}

public class lab4_ques_four {

    public static void main(String[] args) {

        Course student1 = new Course();
        student1.CourseName("Computer Science");
        student1.CourseCode(11845);
    }

}
