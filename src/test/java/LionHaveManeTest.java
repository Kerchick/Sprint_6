import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class LionHaveManeTest {
    private final String maleSex = "Самец";
    private final String femaleSex = "Самка";
    @Mock
    Feline feline;

    @Test
    public void haveManeTest() throws Exception {
        Lion lion = new Lion(femaleSex, feline);
        boolean mane =  lion.doesHaveMane();
        assertFalse(mane);
    }

    @Test
    public void haveNoManeTest() throws Exception {
        Lion lion = new Lion(maleSex, feline);
        boolean mane =  lion.doesHaveMane();
        assertTrue(mane);
    }
}
