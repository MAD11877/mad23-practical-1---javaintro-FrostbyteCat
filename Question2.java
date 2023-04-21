import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    double height;
    double weight;
    Scanner scanner = new Scanner(System.in);

    while (true){
      System.out.print("Enter height in metres (m): ");

      if (scanner.hasNextDouble()){
        height = scanner.nextDouble();
      }
      else{
        System.out.println("Invalid input. Please enter a number.");
        scanner.next();
        continue;
      }
      break;
    }

    while(true){
      System.out.print("Enter weight in kilograms (kg): ");
      
      if (scanner.hasNextDouble()){
        weight = scanner.nextDouble();
      }
      else{
        System.out.println("Invalid input. Please enter a number.");
        scanner.next();
        continue;
      }
      break;
    }

    scanner.close();
    double bmi = weight/(height*height);
    System.out.printf("Your BMI is %.2f", bmi);
  }
}
