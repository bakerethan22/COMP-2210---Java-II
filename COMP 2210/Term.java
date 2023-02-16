import java.util.Comparator;
public class Term implements Comparable<Term> {
   private String query;
   private long weight;

   /**
    * Initialize a term with the given query and weight.
    * This method throws a NullPointerException if query is null,
    * and an IllegalArgumentException if weight is negative.
    */
   public Term(String query, long weight) { 
      if (query == null) {
         throw new NullPointerException("Query should not be null");
      
      }
      if (weight < 0) {
         throw new IllegalArgumentException("Weight should not be negative");
      }
      this.query = query;
      this.weight = weight;
   }

   /**
    * Compares the two terms in descending order of weight.
    */
   public int compareByDescendingWeightOrder(Term t1, Term t2) {
      int result = 0;
      if (t1.weight < t2.weight) {
         result = -1;
      } else if (t1.weight == t2.weight) {
         result = 0;
      } else if (t1.weight > t2.weight) {
         result = 1;
      }
      return result;
     
   }

   /**
    * Compares the two terms in ascending lexicographic order of query,
    * but using only the first length characters of query. This method
    * throws an IllegalArgumentException if length is less than or equal
    * to zero.
    */
   public static Comparator<Term> byPrefixOrder(int length) { 
      if (length <= 0) {
         throw new IllegalArgumentException();
      }
      return null;
   }

   /**
    * Compares this term with the other term in ascending lexicographic order
    * of query.
    */
   @Override
   public int compareTo(Term other) {
      return this.compareTo(other); 
   }

   /**
    * Returns a string representation of this term in the following format:
    * query followed by a tab followed by weight
    */
   @Override
   public String toString(){
      String output = query + "\t" + weight;
   
      return output;
   }

}