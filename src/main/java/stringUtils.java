import org.apache.commons.lang3.StringUtils;
import java.util.ResourceBundle;
import java.util.Scanner;


public class stringUtils {

    public static void main(String[] args) { //plugging in all the methods from below
        String Input = userInteraction(); //assigning an input to the method below, so we can use in main
        System.out.println("You entered: " + Input); //once the method is complete, it will do this

        //don't need to assign a boolean variable because using the input from above, and calling the boolean method below
        if (isANumber(Input)) {
            System.out.println("Your number is: " + Input);
        } else {
            System.out.println(Input + " is not a number.");
        }

        String swapCase = stringSwapCase(Input); //assigning the new input to the method below to use it
        System.out.println("Here is your input with opposite casing: " + swapCase);

        String reverse = stringReverse(Input);
        System.out.println("Here is your input in a reverse format: " + reverse);

    }


    // DO THIS FIRST: You need to create the fields that belong to an object or a class:
    // - so the static string and the boolean that belong to the StringUtils class
    // - when creating the methods, userInput is the placeholder for what will be needed in the main class

    // Static Fields: Belong to a class as a whole, accessible through the class itself so accessible without creating an instance of the class

    public static String userInteraction() {
        System.out.println("Please enter a statement:");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static boolean isANumber(String userInput) {
        return StringUtils.isNumeric(userInput);
    }

    public static String stringSwapCase(String userInput) {
        return StringUtils.swapCase(userInput);
    }

    public static String stringReverse(String userInput) {
        return StringUtils.reverse(userInput);
    }

}



