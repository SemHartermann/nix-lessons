import com.lessons.nix.Car;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestCar {
    Car volvoXcSeventy = new Car();
    @Test
    public void testIsCarCanGo(){
        assertTrue(volvoXcSeventy.isCarCanGo());
    }

    @Test
    public void testIsCarApproved(){
        assertTrue(volvoXcSeventy.isCarApproved());
    }

    @Test
    public void testHowMuchCarCanDrive(){
        assertEquals(1400, (int)volvoXcSeventy.howMuchCarCanDrive());
    }
}
