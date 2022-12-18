import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;
import client.Client;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("накопительный", 3000, 500);
      CheckingAccount checkingAccount = new CheckingAccount("Расчетный", 4000);
       CreditAccount creditAccount = new CreditAccount("Кредитный", 0);


        Account[] accounts = {
                new SavingsAccount("накопительный", 3000, 500),
                new CheckingAccount("Расчетный", 4000),
                new CreditAccount("Кредитный", 0)
        };
        Client client = new Client("Фома", 4);
        client.addAcc(new SavingsAccount("накопительный", 3000, 500));
        client.addAcc(new CheckingAccount("Расчетный",4000));
        client.addAcc( new CreditAccount("Кредитный", 0));
        client.pay(5000);

savingsAccount.transfer(checkingAccount,200);

        client.accept (2000);
    }
}