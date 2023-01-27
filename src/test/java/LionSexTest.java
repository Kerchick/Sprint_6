import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;





@RunWith(MockitoJUnitRunner.class)
public class LionSexTest {
    @Mock
    Feline feline;

    private final String randomSex = "Неопределенный пол";
    private final String femaleSex = "Самка";
    private final String maleSex = "Самец";

    @Test
    public void LionMaleTest() throws Exception {
        new Lion(maleSex, feline);
        assertEquals("Самец", maleSex);
    }


    @Test
    public void LionFemaleTest() throws Exception {
        new Lion(femaleSex, feline);
        assertEquals("Самка", femaleSex);

    }

    @Test
    public void LionHaveSexExceptionTest() throws Exception {
        try {
            new Lion(randomSex, feline);
        }
        catch (Exception exception) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }
    }
}