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
    public void lionMaleTest() throws Exception {
        new Lion(maleSex, feline);
        assertEquals("Самец", maleSex);
    }


    @Test
    public void lionFemaleTest() throws Exception {
        new Lion(femaleSex, feline);
        assertEquals("Самка", femaleSex);

    }

    @Test(expected = Exception.class)
    public void lionHaveSexExceptionTest() throws Exception {
            new Lion(randomSex, feline);
        }
}