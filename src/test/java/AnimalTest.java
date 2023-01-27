import com.example.Animal;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void herbivoreTest() throws Exception {
        Animal animal = new Animal();
        List<String> getFood = animal.getFood("Травоядное");
        assertEquals(List.of("Трава", "Различные растения"), getFood);
    }

    @Test
    public void foodExceptionTest() throws Exception {
        try {
            Animal animal = new Animal();
            animal.getFood("Всеядное");
        }
        catch (Exception exception){
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник" , exception.getMessage());
        }
    }

    @Test
    public void getFamilyTest()  {
        Animal animal = new Animal();
        String getFamily = animal.getFamily();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", getFamily);

    }

}
