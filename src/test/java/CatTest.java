import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class CatTest {

    @Test
    public void catSoundTest() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String getSound = cat.getSound();
        assertEquals("Мяу", getSound);
    }

    @Test
    public void catGetFoodTest() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> getFood = cat.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), getFood);
    }

}
