class Wallet 
{
    private double balance;
    private boolean closed = false;

    Wallet(double balance) {
        this.balance = balance;
    }

    public void deposit(double amt) throws IllegalStateException {
        if (closed) {
            throw new IllegalStateException("Wallet is closed");
        }

        balance += amt;
    }

    public void withdraw(double amt)
            throws InsufficientFundsException, IllegalStateException {

        if (closed) {
            throw new IllegalStateException("Wallet is closed");
        }

        if (amt > balance) {
            throw new InsufficientFundsException("Insufficient funds");
        }

        balance -= amt;
    }

    public void close() {
        closed = true;
    }

    public double getBalance() {
        return balance;
    }
}
