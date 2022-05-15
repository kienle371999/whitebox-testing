import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void test(int n, boolean expectedOutput){
        assertEquals(expectedOutput, Prime.isPrime(n));
    }
}
