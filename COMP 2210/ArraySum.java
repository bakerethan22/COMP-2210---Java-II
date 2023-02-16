/**
 * Provides a sum function on arrays.
 *
 * @author Dean Hendrix (dh@auburn.edu)
 * @version 2018-03-26
 */
public class ArraySum {

	/** Returns the sum of values in the given array. */
   public static int sum(int[] a, int left, int right) {
      int sum = 0;
      if (a[left] == a[right]) {
         return left;
      } else {
         for (int i = 0; i < a.length; i++) {
            sum += a[i];
         
         
         } 
         return sum;
         
      }
   }

}
