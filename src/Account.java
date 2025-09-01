public class Account {

    private static final String BANK = "Liceo Bank";
    private static final double RATE = 0.03; // 3%
    private static int createdAccounts = 0;

    private final String id;
    private final String holder;
    private double funds;

    public Account(String holder, double initialDeposit) {
        this.holder = holder;
        this.funds = initialDeposit;
        this.id = makeAccountId();
        createdAccounts++;
        System.out.println("Account Created: " + id + " for " + holder + " with initial balance: $" + funds);
    }

    private static String makeAccountId() {
        return "ACC" + String.format("%03d", createdAccounts + 1);
    }


    public void addFunds(double amount) {
        if (amount > 0) {
            funds += amount;
            System.out.println(holder + " deposited $" + amount + ". New balance: $" + funds);
        }
    }


    public void takeFunds(double amount) {
        if (amount > 0 && amount <= funds) {
            funds -= amount;
            System.out.println(holder + " withdrew $" + amount + ". New balance: $" + funds);
        } else {
            System.out.println("Insufficient balance for " + holder);
        }
    }


    public double computeInterest() {
        return funds * RATE;
    }


    public static void showBankDetails() {
        System.out.println("Bank Name: " + BANK);
        System.out.println("Interest Rate: " + (RATE * 100) + "%");
    }

    public static void showTotalAccounts() {
        System.out.println("Total Accounts Created: " + createdAccounts);
    }

    public String getHolder() {
        return holder;
    }
}