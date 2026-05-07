import org.junit.jupiter.api.Test;
import service.BankService;
import service.BankServiceImpl;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class BankServiceTest {

        @Test
        void createAccount_shouldStoreAccount() {
        BankService bankService = new BankServiceImpl();

        bankService.createAccount("005", "Sara", 800);

        assertDoesNotThrow(() -> bankService.deposit("005", 100));
        }
}
