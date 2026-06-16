import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void testInitialBalance() {
        BankAccount account = new BankAccount(100);
        assertEquals(100, account.getBalance());
    }

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount(100);
        account.withdraw(30);
        assertEquals(70, account.getBalance());
    }

    @Test
    void testInsufficientFunds() {
        BankAccount account = new BankAccount(100);

        assertThrows(
                IllegalArgumentException.class,
                () -> account.withdraw(200)
        );
    }

    @Test
    void testNegativeDeposit() {
        BankAccount account = new BankAccount(100);

        assertThrows(
                IllegalArgumentException.class,
                () -> account.deposit(-50)
        );
    }

    @Test
    void testNegativeWithdrawal() {
        BankAccount account = new BankAccount(100);

        assertThrows(
                IllegalArgumentException.class,
                () -> account.withdraw(-10)
        );
    }

    @Test
    void testWithdrawFullBalance() {
        BankAccount account = new BankAccount(100);
        account.withdraw(100);
        assertEquals(0, account.getBalance());
    }

    @Test
    void testMultipleTransactions() {
        BankAccount account = new BankAccount(100);

        account.deposit(50);
        account.withdraw(20);
        account.deposit(70);

        assertEquals(200, account.getBalance());
    }
}