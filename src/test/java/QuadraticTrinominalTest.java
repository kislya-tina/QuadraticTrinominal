import org.testng.annotations.Test;
import quad.QuadraticTrinominal;

import static org.testng.Assert.assertEquals;

public class QuadraticTrinominalTest {
    QuadraticTrinominal first = new QuadraticTrinominal(1, 2, 1);
    QuadraticTrinominal third = new QuadraticTrinominal(2, 2, 2);


    @Test
    public void FirstTest(){
        double[] answer = {-1};
        assertEquals(first.decision(), answer);
    }

    @Test (expectedExceptions = {IllegalArgumentException.class})
    public void SecondTest(){
        QuadraticTrinominal second = new QuadraticTrinominal(0, -2, 1);
//        double[] answer = {3, 0.5};
//        assertEquals(second.decision(), answer);
    }

    @Test(expectedExceptions = {IllegalArgumentException.class})
    public void ThirdTest(){
        if(third.decision().length > 2){
            throw new IllegalArgumentException();
        }
    }
}
