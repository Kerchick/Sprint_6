import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import static org.junit.Assert.assertEquals;




public class LionGetKittenTest {

    @Test
    public void getKittenTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        int kitten = lion.getKittens();
        assertEquals(1, kitten);
    }
}
