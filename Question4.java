import java.util.Scanner;

//import org.w3c.dom.ranges.Range;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
    
    int factor;
    Scanner scanner = new Scanner(System.in);
    
    while (true){
      System.out.print("Enter an integer to create an inverted triangle: ");
      if (scanner.hasNextInt()){
        factor = scanner.nextInt();
      }
      else{
        System.out.println("Invalid input. Please enter an integer.");
        scanner.next();
        continue;
      }
      break;
    }
    scanner.close();

    for(int i = factor; i>=0; i--){
      for(int num = 1; num <= i; num++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
