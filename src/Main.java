import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();
        System.out.print("Enter Section: ");
        String section = scanner.nextLine();

        System.out.print("Enter Midterm Exam Score: ");
        int midtermScore = scanner.nextInt();

        System.out.print("Enter Final Exam Score: ");
        int finalScore = scanner.nextInt();

        System.out.print("Enter Project Score: ");
        int projectScore = scanner.nextInt();

        System.out.print("Enter Attendance Score: ");
        int attendanceScore = scanner.nextInt();

        System.out.println("\nSTUDENT INFORMATION");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);

        int totalScore = midtermScore + finalScore + projectScore + attendanceScore;
        double averageScore = totalScore / 4.0;

        String remarks = (averageScore < 75) ? "FAILED" : "PASSED";

        System.out.println("\nSTUDENT SCORE");
        System.out.println("Midterm Exam Score: " + midtermScore);
        System.out.println("Final Exam Score: " + finalScore);
        System.out.println("Project Score: " + projectScore);
        System.out.println("Attendance Score: " + attendanceScore);

        System.out.println("\nAverage Score: " + averageScore);
        System.out.println("Remarks: " + remarks);

        scanner.close();
    }
}
