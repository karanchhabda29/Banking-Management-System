import model.Account;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


public class AccountTest {
@Test
    void deposit_shouldIncreaseBalance(){

        // Arrange
        Account account = new Account("001", "Ali", 500);

        //Act
        account.deposit(100);

        // Assert
        assertEquals(600, account.getBalance(), 0.001);
    }
@Test
    void withdraw_shouldDecreaseBalance(){

        //
        Account account = new Account("002", "Ahmed", 1000);

        //
        account.withdraw(300);

        //
        assertEquals(700, account.getBalance(), 0.001);
    }

@Test
    void withdraw_shouldThrowException(){
        Account account = new Account("003", "Omer", 200);

        assertThrows(RuntimeException.class, () -> {
            account.withdraw(500);
        });
    }

}

