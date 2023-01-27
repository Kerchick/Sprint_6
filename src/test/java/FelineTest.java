import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String getFamily = feline.getFamily();
        assertEquals("Кошачьи", getFamily);
    }

    @Test
    public void felineGetFoodTest() throws Exception {
        Feline feline = new Feline();
        List<String> eatMeat = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), eatMeat);
    }
}
