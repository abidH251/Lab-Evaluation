interface Account 
{
    void deposit(double amt) throws InvalidAmountException;
    void withdraw(double amt) throws InvalidAmountException;
}
