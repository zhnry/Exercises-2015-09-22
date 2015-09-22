package stringsexercises;
/*
 * String Equality
 * @author Phil O'Connell <pxo4@psu.edu>
 */
public class StringEquality {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Running Strings02");

    String name1 = "Phil";
    String name2 = new String("Phil");

    if (name1 == name2) {
      System.out.println("they are equal");
    } else {
      System.out.println("they are not equal");
    }
  }

}
