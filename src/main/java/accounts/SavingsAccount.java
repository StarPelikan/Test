package accounts;

public class SavingsAccount extends Account {
    protected long minBalance;

    public SavingsAccount(String name, long balance, long minBalance) {
        super(name, balance);
        this.minBalance = minBalance;
    }

    //Оплата
    @Override
    public boolean pay(long amount) {
        if (balance - amount < minBalance) {
            return false;
        } else {
            balance -= amount;
            return true;

        }
    }

    //пополнение
    @Override
    public boolean add(long amount) {
        balance += amount;
        return true;
    }


}
