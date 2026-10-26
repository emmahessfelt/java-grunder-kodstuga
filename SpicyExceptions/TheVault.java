package SpicyExceptions;

public class TheVault 
{
    private int balance;

    TheVault(int balance)
    {
        this.balance = balance;
    }

    public void withDraw(int amount)
    {
        
        if (amount <= 0)
        {
            throw new IllegalArgumentException("The amount you want to withdraw has to be larger than 0.");
        }
        else if(amount > this.balance)
        {
            throw new IllegalArgumentException("You cannot withdraw this amount, it is larger than your balance.");
        }
        else
        {
            this.balance -= amount;
            System.out.println("Your new balance is " + this.balance);
        }
    }

}
