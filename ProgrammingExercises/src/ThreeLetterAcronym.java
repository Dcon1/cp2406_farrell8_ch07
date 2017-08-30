import java.util.Scanner;

/**
 * Created by jc441213 on 30/08/17.
 */
public class ThreeLetterAcronym {
    public static void main(String[] args) {
        int length;
        int x;
        String[] acronym = new String[3];
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 3 words");
        String userInput = in.nextLine();
        length = userInput.length();
        System.out.println(userInput.charAt(0));
        for (x = 0; x <= length; x++)
            if (userInput.charAt(x) == ' ') {
                System.out.println(userInput.charAt(x + 1));
            }
        }
    }