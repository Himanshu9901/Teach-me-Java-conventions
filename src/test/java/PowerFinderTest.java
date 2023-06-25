import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import powerpackage.PowerFinder;

public class PowerFinderTest {
    @Test
    public void oneRaisedToOneIsOne() {
        Assertions.assertEquals(PowerFinder.of(1, 1), 1);
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        Assertions.assertEquals(PowerFinder.of(2, 1), 2);
    }

    @Test
    public void twoPowerTwoIsFour() {
        Assertions.assertEquals(PowerFinder.of(2, 2), 4);
    }

    @Test
    public void powerOfTwoAndThreeIsSix() {
        Assertions.assertEquals(PowerFinder.of(3, 2), 9);
    }
}
