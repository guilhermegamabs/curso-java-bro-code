package ex1;

public class Client extends Pessoa{
    private float balance;

    Client(String name, int age, float balance) {
        super(name, age);
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Your balance is " + balance;
    }
}
