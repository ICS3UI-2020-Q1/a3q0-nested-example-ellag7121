import java.util.Scanner;
/**
 * Example program for nested statements
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // - - - SWITCH CASE EXAMPLE - - - //
    //get the user's choice between 1 -5
    System.out.println("Please make a selection (1-3)");
    int choice = input.nextInt();
    input.nextLine();

    //determine which candy to drop
    switch (choice){
      case 1:
        System.out.println("Here is your chocolate bar");
        break;
      case 2:
        System.out.println("Here are your Skittles");
        break;
      case 3:
        System.out.println("Here are your M&Ms");
        break;
      default:
        System.out.println("Invalid Choice");
    }







    // - - - NESTED LOOP EXAMPLE - - - //
    //ask the user if the animal has feathers
    System.out.println("Does the animal have feathers???");
    String featherAnswer = input.nextLine();

    //check feather Status
    if(featherAnswer.equals("yes")){
      //get feather colours
      System.out.println("what colour are the feathers (red/blue)");
      String featherColour = input.nextLine();

      //determine type of bird
      if(featherColour.equals("blue")){
        System.out.println("That is a blue jay");
      }else if(featherColour.equals("red")){
        System.out.println("That is a cardinal");
      }

    //if the user answered no
    }else{ 

    }
    
  }
}
