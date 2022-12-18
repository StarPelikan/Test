package accounts;

public abstract class Account implements MoneyTarget {
    protected String name;
    protected long balance;

    public Account(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    //оплата
    public abstract boolean pay(long amount);
    //пополнение
    public abstract boolean add(long amount);
//перевод
    public boolean transfer(Account accountTo, long amount) {
        if (pay(amount)) {
            if (accountTo.add(amount)) {
                System.out.println("операция перевода успешна");
                return true;
            } else {
                add(amount);
                System.out.println("нельзя совершить перевод");
                return false;
            }
        } else {
            System.out.println("операция не возможна");
            return false;
        }
    }

    @Override
    public boolean accept(int money) {
        return add(money);
    }
}

