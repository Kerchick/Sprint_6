import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;



@RunWith(MockitoJUnitRunner.class)
public class LionGetKittenTest {
    private final String lionSex = "Самка";

    @Mock
    Feline feline;
    @Test
    public void getKittenTest() throws Exception {
        Lion lion = new Lion(lionSex, feline);
        Mockito.when(lion.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }
}
