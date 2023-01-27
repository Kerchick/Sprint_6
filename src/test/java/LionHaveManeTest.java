import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class LionHaveManeTest {

    @Mock
    Feline feline;

    @Test
    public void haveManeTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean mane =  lion.doesHaveMane();
        assertFalse(mane);
    }

    @Test
    public void haveNoManeTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean mane =  lion.doesHaveMane();
        assertTrue(mane);
    }
}
