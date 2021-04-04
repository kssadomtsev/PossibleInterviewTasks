package task3;

import java.io.File;
import java.security.InvalidParameterException;
import java.util.Scanner;

public class RLE {
    public static void main(String[] args) {
        File file = new File(System.getProperty("user.dir") + "/src/task3/input");
        Scanner input = null;
        try {
            input = new Scanner(file);
            while (input.hasNextLine()) {
                try {
                    formatInput(input.nextLine());
                } catch (InvalidParameterException e) {
                    e.printStackTrace();
                }
                            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void formatInput(String input) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < input.length()) {
            char currentCharacter = input.charAt(i);
            int count = 1;
            while (i < input.length() - 1) {
                checkCharacter(input.charAt(i));
                if (input.charAt(i + 1) == currentCharacter) {
                    count++;
                    i++;
                } else {
                    break;
                }
            }
            stringBuilder.append(currentCharacter).append(count);
            i++;
        }
        System.out.println(stringBuilder.toString());
    }

    private static void checkCharacter(char ch) throws Exception {
        if (!Character.isAlphabetic(ch)) {
            throw new InvalidParameterException("Invalid character");
        }
    }

}
