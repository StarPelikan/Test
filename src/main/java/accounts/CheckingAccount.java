package accounts;

public class CheckingAccount extends Account {
    protected long minBalance;
    public CheckingAccount(String name, long balance) {
        super(name, balance);

    }

    //списание -
    @Override
    public boolean pay(long amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    //пополнение +
    @Override
    public boolean add(long amount) {
        balance += amount;
        return true;
    }


}
