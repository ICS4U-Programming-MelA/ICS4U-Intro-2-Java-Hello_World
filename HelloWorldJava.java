/* Does a variety of actions in the Java language.
*/
/* Import of necessary files
*/
import java.util.Scanner;

 class HelloWorldJava {
  public static void main(String[] args) {
/* Displays Hello World
*/
    System.out.print("Hello world!\n");
    System.out.print("\n");
/* Asks the user for their name and has a dialogue.
*/
    Scanner input = new Scanner(System.in);
    System.out.print("What is your name?\n");
    String userName = input.next();
    System.out.print("\n");
    System.out.print(userName + "! What a nice name you have.\n");
/* Asks the user for the cost of an item and
tells them the total including HST.
*/
    System.out.print("I am able to add HST tax to a cost.");
    System.out.print(" Please enter a cost, whole or not.\n");
    double userCost = input.nextDouble();
    double tax = userCost * 0.13;
    double finalCost = userCost + tax;
    double roundedFinalCost = Math.round(100.0 * finalCost) / 100.0;
    System.out.print("\nThe final cost with HST is: " + roundedFinalCost);
    System.out.print("\n");
/* Asks the user for their age and tells them whether
or not they can vote.
*/
    System.out.print("I can also tell you whether or not you can vote.\n");
    System.out.print("Please enter your age.\n");
    int userAge = input.nextInt();
    if (userAge <= 17) {
      System.out.print("\nYou are not able to vote.");
    }
    else {
      System.out.print("\nYou are able to vote.");
    }
    input.close();
  }
 }