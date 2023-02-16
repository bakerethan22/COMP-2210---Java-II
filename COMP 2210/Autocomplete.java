import java.util.Arrays;

public class Autocomplete {

	/**
	 * Initializes a data structure from the given array of terms.
	 * This method throws a NullPointerException if terms is null.
	 */
   public Autocomplete(Term[] terms) {
      if(terms == null) {
         throw new NullPointerException();
      
      }
      Arrays.sort(term);
      this.terms = terms;
   
   }

	/** 
	 * Returns all terms that start with the given prefix, in descending order of weight. 
	 * This method throws a NullPointerException if prefix is null.
	 */
   public Term[] allMatches(String prefix) { 
      if(terms == null) {
         throw new NullPointerException();
      
      }
      int i = prefix.length();
      Comparator<Term> comp = Term.byPrefixOrder(i);
      Term key = new Term(prefix, -1);
      int index1 = BinarySearch.firstIndexOf(terms, key, comp);
      int index2 = BinarySearch.lastIndexOf(terms, key, comp);
      if(index1 == -1) {
         return null;
      
      } else {
      
      Term found[] = new Term[index2 - index1 + 1];
      for(int i = index1; i <= index2; i++) {
         found[i - index1] = terms[i];
         
         }
      Arrays.sort(found, Term.byDescendingWeightOrder());
      return found;   
      } 
   
   }

}