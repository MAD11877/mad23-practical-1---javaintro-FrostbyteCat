import java.util.ArrayList;
import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    int num_of_inputs;
    ArrayList<Integer> intList = new ArrayList<Integer>();
    Scanner scanner = new Scanner(System.in);

    while(true){
      System.out.print("Enter an integer:");

      if(scanner.hasNextInt()){
        num_of_inputs = scanner.nextInt();
      }
      else{
        System.out.println("Invalid input. Please enter an integer.");
        scanner.next();
        continue;
      }
      break;
    }

    for(int i = num_of_inputs; i > 0; i--){
      while(true){
        int remaining_int;
        System.out.printf("Enter an integer [%d remaining integers]: ", i);

        if(scanner.hasNextInt()){
          remaining_int = scanner.nextInt();
          intList.add(remaining_int);
        }
        else{
          System.out.println("Invalid input. Please enter an integer.");
          scanner.next();
          continue;
        }
        break;
      }
    }
    scanner.close();
    int highest_frequency_int = -1;
    int highest_count = -1;
    boolean mode = false;

    for(int i = 0; i < intList.size(); i++){
      int temp_int = intList.get(i);
      int temp_count = 1;

      for(int num = i+1; num < intList.size(); num++){
        if(intList.get(num).equals(temp_int)){
          temp_count++;
        }
      }

      if(temp_count > highest_count){
        highest_frequency_int = temp_int;
        highest_count = temp_count;
        mode = true;
      }
    }

    if(mode == true){
      System.out.printf("The mode calculated from the integers of the inputs is %d and it has a frequency of %d.", highest_frequency_int, highest_count);
    }
    //To account for scenarios where there is no mode or no unique mode
    else if(mode == false){
      System.out.print("There is no unique mode based on the integers from the inputs.");
    }
    
  }
}
