import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
    int user_int;
    Scanner scanner = new Scanner(System.in);

    while(true){
      System.out.print("Enter an integer to calculate the result when it multiplies itself: ");

      if(scanner.hasNextInt()){
        user_int = scanner.nextInt();
      }
      else{
        System.out.println("Invalid input. Please enter an integer.");
        scanner.next();
        continue;
      }
      break;
    }

    scanner.close();
    int result = user_int * user_int;
    System.out.printf("The result of %d when multiplied by itself is %d.", user_int, result);
  }
}
