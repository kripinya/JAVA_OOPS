
import java.util.Scanner;

class StudentGrade {

    int OOP, SoftwareEng, DCN, LinearAlgebra, CloudCompFundamentals;

    public double average() {
        return (this.OOP + this.SoftwareEng + this.DCN + this.LinearAlgebra + this.CloudCompFundamentals) / 5.0;
    }

    public void printResult() {
        double average = average();
        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 75) {
            System.out.println("Grade: B");
        } else if (average >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}

public class lab1_first {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentGrade s1 = new StudentGrade();
        System.out.println("enter OOP marks:");
        s1.OOP = sc.nextInt();
        System.out.println("enter Software engineering marks:");
        s1.SoftwareEng = sc.nextInt();
        System.out.println("enter linear Algebra marks:");
        s1.LinearAlgebra = sc.nextInt();
        System.out.println("enter Data Communication and Networking marks:");
        s1.DCN = sc.nextInt();
        System.out.println("enter Cloud Computing Fundamentals marks:");
        s1.CloudCompFundamentals = sc.nextInt();
        s1.printResult();
        //sc.close();
    }
}
