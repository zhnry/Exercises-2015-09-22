package stringsexercises;

import java.util.Arrays;
import java.util.List;

/**
 * String manipulation
 * @author Phil O'Connell <pxo4@psu.edu>
 */
public class StringManipulating {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Running Strings02");
    List<String> simpsons = Arrays.asList("Homer", "Marge", "Lisa", "Bart", "Maggie");
    String family = "";
    for (String name : simpsons) {
      family += ", " + name;
    }
    System.out.println("Family: " + family.substring(2));
  }

}
