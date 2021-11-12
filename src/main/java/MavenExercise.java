import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("May I have some input to work with?");
        String userInput = myScanner.nextLine();

        System.out.println("StringUtils.isNumeric(userInput) = " + StringUtils.isNumeric(userInput));
        System.out.println("String manipulation - case below!");
        System.out.println("StringUtils.lowerCase(userInput) = " + StringUtils.lowerCase(userInput));
        System.out.println("StringUtils.upperCase(userInput) = " + StringUtils.upperCase(userInput));
        System.out.println("StringUtils.swapCase(userInput) = " + StringUtils.swapCase(userInput));

        System.out.println("Let's reverse this boy!");
        System.out.println("StringUtils.reverse(userInput) = " + StringUtils.reverse(userInput));


    }


}
