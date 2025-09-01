public class Main {
    public static void main(String[] args) {
        Account.showBankDetails();
        System.out.println();

        Account acc1 = new Account("John Doe", 1000.0);
        Account acc2 = new Account("Jane Smith", 2500.0);
        Account acc3 = new Account("Bob Johnson", 500.0);

        System.out.println("\n==== Account Operations ====");
        acc1.addFunds(500.0);
        acc2.takeFunds(300.0);

        System.out.println("\n==== Interest Calculation ====");
        System.out.println(acc1.getHolder() + "'s interest: $" + acc1.computeInterest());
        System.out.println(acc2.getHolder() + "'s interest: $" + acc2.computeInterest());
        System.out.println(acc3.getHolder() + "'s interest: $" + acc3.computeInterest());

        System.out.println();
        Account.showTotalAccounts();
    }
}