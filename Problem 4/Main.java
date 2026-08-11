import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double startingBalance = sc.nextDouble();
        Wallet wallet = new Wallet(startingBalance);

        while (sc.hasNext()) {

            String operation = sc.next();

            try {

                if (operation.equals("deposit")) {

                    double amount = sc.nextDouble();
                    wallet.deposit(amount);

                    System.out.println(wallet.getBalance());

                } 
                else if (operation.equals("withdraw")) {

                    double amount = sc.nextDouble();
                    wallet.withdraw(amount);

                    System.out.println(wallet.getBalance());

                } 
                else if (operation.equals("close")) {

                    wallet.close();
                    System.out.println("Wallet closed");

                }

            } catch (Exception e) {

                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}