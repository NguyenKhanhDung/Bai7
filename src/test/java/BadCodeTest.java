import com.auction.BadCode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class BadCodeTest {

    private BadCode account;

    @BeforeEach
    void setUp() {
        account = new BadCode(1000);
    }

    @Test
    @DisplayName("deposit: balance tăng đúng")
    void testDeposit_balanceIncreases() {
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    @DisplayName("deposit: nạp nhiều lần cộng dồn đúng")
    void testDeposit_multipleTimes() {
        account.deposit(200);
        account.deposit(300);
        assertEquals(1500, account.getBalance());
    }

    @Test
    @DisplayName("deposit: trả về balance mới")
    void testDeposit_returnsNewBalance() {
        int result = account.deposit(400);
        assertEquals(1400, result);
    }

    @Test
    @DisplayName("withdraw: balance giảm đúng")
    void testWithdraw_balanceDecreases() {
        account.withdraw(300);
        assertEquals(700, account.getBalance());
    }

    @Test
    @DisplayName("withdraw: trả về balance mới")
    void testWithdraw_returnsNewBalance() {
        int result = account.withdraw(200);
        assertEquals(800, result);
    }

    @Test
    @DisplayName("getBalance: balance ban đầu đúng")
    void testGetBalance_initial() {
        assertEquals(1000, account.getBalance());
    }
}