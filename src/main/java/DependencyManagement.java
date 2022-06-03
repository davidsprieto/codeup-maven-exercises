import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class DependencyManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter something: ");
        String userInput = scanner.nextLine();
        if (!StringUtils.isNumeric(userInput)) {
            System.out.println("You entered: " + userInput);
        } else {
            System.out.println(userInput + " is a number.");
        }

        System.out.print("Please enter something else: ");
        String userInput2 = scanner.nextLine();
        System.out.println("Let's swap the case: " +  StringUtils.swapCase(userInput2));

        System.out.println("Now lets reverse it: " + StringUtils.reverse(userInput2));
    }

}