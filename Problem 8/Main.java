import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double startingBalance = sc.nextDouble();

        SavingsAccount account =
                new SavingsAccount(startingBalance);

        while (sc.hasNext()) {

            String operation = sc.next();
            double amount = sc.nextDouble();

            try {

                if (operation.equals("deposit")) {
                    account.deposit(amount);
                }
                else if (operation.equals("withdraw")) {
                    account.withdraw(amount);
                }

            } catch (InvalidAmountException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Apply interest
        account.balance =
                account.balance +
                account.balance * account.interestRate();

        System.out.printf("Final Balance: %.2f%n", account.balance);
    }
}
