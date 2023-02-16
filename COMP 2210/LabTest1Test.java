import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class LabTest1Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void CountOdds() {
      int[] a = {1, 2, 3, 4, 5};
      Assert.assertEquals(3, 3, 0.000001);
   }
   
   /** A test that always fails. **/
   @Test public void tailSet() {
     Collection<Integer> set = new TreeSet<>();
     set.add(2);
     set.add(4);
     set.add(6);
     set.add(8);
     set.add(10);
     toElement = 5;
      Assert.assertEquals(a = [6, 8, 10], a = [6, 8, 10]);
   }
}
