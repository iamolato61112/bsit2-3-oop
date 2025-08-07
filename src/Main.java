public class Main {
    public static void main(String[] args) {

        StudentInfo student1 = new StudentInfo("Bartolomeo K", 23, "SBMA", 95, 92, 91);
        StudentInfo student2 = new StudentInfo("Hunter K", 19, "CRIM", 80, 84, 87);
        StudentInfo student3 = new StudentInfo("Miming", 19, "BSIT", 91, 92, 93);

        int passingCount = 0;


        System.out.println(" ");
        student1.displayInfo();
        double avg1 = student1.calculateAverage();
        System.out.println("Average: " + avg1);
        String grade1 = student1.getGrade();
        System.out.println("Letter Grade: " + grade1);
        boolean pass1 = student1.isPassing();
        if (pass1) {
            System.out.println("Status: PASSING");
            passingCount++;
        } else {
            System.out.println("Status: FAILING");
        }


        System.out.println(" ");
        student2.displayInfo();
        double avg2 = student2.calculateAverage();
        System.out.println("Average: " + avg2);
        String grade2 = student2.getGrade();
        System.out.println("Letter Grade: " + grade2);
        boolean pass2 = student2.isPassing();
        if (pass2) {
            System.out.println("Status: PASSING");
            passingCount++;
        } else {
            System.out.println("Status: FAILING");
        }


        System.out.println(" ");
        student3.displayInfo();
        double avg3 = student3.calculateAverage();
        System.out.println("Average: " + avg3);
        String grade3 = student3.getGrade();
        System.out.println("Letter Grade: " + grade3);
        boolean pass3 = student3.isPassing();
        if (pass3) {
            System.out.println("Status: PASSING");
            passingCount++;
        } else {
            System.out.println("Status: FAILING");
        }

        System.out.println(" ");
        System.out.println("Summary: " + passingCount + " out of 3 students are passing.");
    }
}