import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;



public class LionGetFoodTest {

    @Test
    public void getKittenTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        List<String> food = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }



}
