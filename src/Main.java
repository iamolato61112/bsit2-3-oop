public static void main(String[] args) {

    GradeCalculator gradeCalculator = new GradeCalculator();
    String studentName = "John Smith";
    double average = gradeCalculator.calculateAverage(85.5, 92.0, 78.5, 90.0);
    String letterGrade = gradeCalculator.getLetterGrade(average);

    gradeCalculator.displayResult(studentName, average);
    gradeCalculator.displayResult(studentName, average, letterGrade);
}