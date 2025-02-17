package junit.bankaccount;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

        private BankAccount account;
        @BeforeEach
        public void setUp() {
            account = new BankAccount(100.0);
        }

        @Test
        void testDeposit() {
            account.deposit(50.0);
            assertEquals(150.0, account.getBalance(), "Balance should be 150.0 after depositing 50");
        }

        @Test
        void testWithdraw() {
            boolean success = account.withdraw(50.0);
            assertTrue(success, "Withdrawal should be successful");
            assertEquals(50.0, account.getBalance(), "Balance should be 50.0 after withdrawing 50");
        }

        @Test
        void testWithdrawInsufficientFunds() {
            boolean success = account.withdraw(200.0);
            assertFalse(success, "Withdrawal should fail due to insufficient funds");
            assertEquals(100.0, account.getBalance(), "Balance should remain 100.0 when withdrawal fails");
        }

        @Test
        void testDepositNegativeAmount() {
            assertThrows(IllegalArgumentException.class, () -> account.deposit(-10.0),
                    "Deposit should throw IllegalArgumentException when the amount is negative");
        }
    }


