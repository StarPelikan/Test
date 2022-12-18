package accounts;

public class CreditAccount extends Account {


    public CreditAccount(String name, long balance) {
        super(name, balance);

    }

    //списание
    @Override
    public boolean pay(long amount) {
        balance -= amount;
        return true;
    }

    //пополнение+
    @Override
    public boolean add(long amount) {
        if (balance + amount > 0) {
            return false;
        } else {
            balance += amount;
            return true;
        }
    }

}
