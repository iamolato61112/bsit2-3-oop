public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Alice Smith", 2001, 80000, "Engineering", 15000, 8);
        System.out.println();
        Developer developer = new Developer("Bob Johnson", 2002, 70000, "Engineering", "Java", 5);
        System.out.println();
        Intern intern = new Intern("Charlie Brown", 2003, 30000, "Engineering", "Tech University", true);
        System.out.println();


        System.out.println("\n*~~~~Employee Details~~~~*");
        System.out.println("Manager Info:");
        manager.displayInfo();
        manager.work();
        System.out.println("Monthly Salary: $" + manager.calculateSalary());
        System.out.println();

        System.out.println("\n*~~~~Employee Details~~~~*");
        System.out.println("Developer Info:");
        developer.displayInfo();
        developer.work();
        System.out.println("Monthly Salary: $" + developer.calculateSalary());
        System.out.println();

        System.out.println("\n*~~~~Employee Details~~~~*");
        System.out.println("Intern Info:");
        intern.displayInfo();
        intern.work();
        System.out.println("Monthly Salary: $" + intern.calculateSalary());
    }
}