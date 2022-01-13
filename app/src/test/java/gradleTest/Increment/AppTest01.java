/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradleTest.Increment;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest01 {
    @Test(timeout = 1000) public void AppWorksProperly() {
        assertEquals(App01.getSum(5), 15);
        assertEquals(App01.getSum(10), 55);
        assertEquals(App01.getSum(15), 120);
        assertEquals(App01.getSum(20), 210);


        assertEquals(App01.getSum(-5), -15);
        assertEquals(App01.getSum(-10), -55);
        assertEquals(App01.getSum(-15), -120);
        assertEquals(App01.getSum(-20), -210);
    }
}
