class SavingsAccount extends BaseAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    double interestRate() {
        return 0.04;   // 4% interest
    }
}