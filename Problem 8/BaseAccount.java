abstract class BaseAccount implements Account {
    protected double balance;

    BaseAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amt) throws InvalidAmountException {
        if (amt < 0) {
            throw new InvalidAmountException("Amount cannot be negative");
        }

        balance += amt;
    }

    public void withdraw(double amt) throws InvalidAmountException {
        if (amt < 0) {
            throw new InvalidAmountException("Amount cannot be negative");
        }

        if (amt > balance) {
            throw new InvalidAmountException("Insufficient balance");
        }

        balance -= amt;
    }

    abstract double interestRate();
}