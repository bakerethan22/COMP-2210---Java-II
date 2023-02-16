import java.util.Comparator;
public class BinarySearch {

   /**
    * Returns the index of the first key in a[] that equals the search key, 
    * or -1 if no such key exists. This method throws a NullPointerException
    * if any parameter is null.
    */
   public static <Key> int firstIndexOf(Key[] a, Key key, Comparator<Key> comparator) { 
      if (a == null) {
         throw new NullPointerException();
      }
      if (key == null) {
         throw new NullPointerException();
      }
      if (comparator == null) {
         throw new NullPointerException();
      }
      int first = 0;
      int last = a.length - 1;
      int middle = (first + last)/2;
      while (first <= last) {
         if (a[middle] == key) {
            return middle;
         } else if (a[middle] < key) {
            first = middle + 1;
         
         } else if (a[middle] > key) {
            last = middle - 1;
         
         } else  {
         
            return -1;
         }
      
      
      }
   
   }

   /**
    * Returns the index of the last key in a[] that equals the search key, 
    * or -1 if no such key exists. This method throws a NullPointerException
    * if any parameter is null.
    */
   public static <Key> int lastIndexOf(Key[] a, Key key, Comparator<Key> comparator) {
      if (a == null) {
         throw new NullPointerException();
      }
      if (key == null) {
         throw new NullPointerException();
      }
      if (comparator == null) {
         throw new NullPointerException();
      }
      int first = 0;
      int last = a.length - 1;
      int middle = (first + last)/2;
      while (first <= last) {
         if (a[middle] == key) {
            return middle;
         } else if (a[middle] < key) {
            first = middle + 1;
         
         } else if (a[middle] > key) {
            last = middle - 1;
         
         } else  {
         
            return -1;
         }
      
      
      }
   
   
   }
}