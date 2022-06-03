// Java II - Testing Code with JUnit Notes:
import org.junit.Test;
        import static org.junit.Assert.*;

public class Testing {

    public static void main(String[] args) {
        testIfCompanyNameMatches();
    }

    @Test
    public static void testIfCompanyNameMatches() {
        String expected = "Codeup";
        String actual = "Code";

        assertEquals(expected, actual);
    }

}
