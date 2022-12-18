import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class BalansTest {
    @Test
    // В лекции сказано и русские буквы поддреживает
    public void testОтрицательныйБаланс() {
        CreditAccount testCreditAccount = new CreditAccount("Кредитный счёт", -300);
        boolean result = testCreditAccount.add(500);
        Assertions.assertFalse(result);

    }

    @Test
    public void testCheckingAccount() {
        CheckingAccount testCheckingAccount = new CheckingAccount("Расчетный", 1000);
        boolean result = testCheckingAccount.pay(1800);
        Assertions.assertFalse(result);

    }

    @Test
    public void testSavingsAccount() {
        SavingsAccount testSavingsAccount = new SavingsAccount("Накопительный", 600, 100);
        boolean result = testSavingsAccount.pay(300);
        Assertions.assertTrue(result);
    }

}



