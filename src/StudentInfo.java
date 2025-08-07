public class StudentInfo {
    String name;
    int age;
    String course;
    double grade1, grade2, grade3;

    public StudentInfo (String name, int age, String Course, double grade1, double grade2, double grade3) {
        this.name = name;
        this.age = age;
        this.course = Course;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3;
    }

    public String getGrade() {
        double average = calculateAverage();
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 75) {
            return "C";
        } else if (average >= 60) {
            return "D";
        }else {
            return "F";
        }
    }

    public boolean isPassing() {
        return calculateAverage() >= 70;
    }
}

