package client;

import accounts.Account;
import accounts.MoneyTarget;

public class Client implements MoneyTarget {
    protected String name;
    protected Account[] accounts;

    public Client(String name, int maxAccount) {
        this.name = name;
        this.accounts = new Account[maxAccount];
    }

    public void addAcc(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
        System.out.println("Мест для добавления нового счёта нет!");
    }

    public boolean pay(long amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].pay(amount)) {
                System.out.println("Осуществлен платеж ");
                return true;
            }
        }
        System.out.println("Ни на одном из счетов не хватило средст");
        return false;
    }

    @Override
    public boolean accept(int money) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].add(money)) ;
            System.out.println("успешно пополнен баланс");
            return true;
        }
        System.out.println("не получилось пополнить баланс");
        return false;
    }
}



