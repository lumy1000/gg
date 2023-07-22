import java.util.Scanner;

public class LongestString1 {
    public static void main(String[] args) {

        boolean textEnoughFound = false;
        String textArray[] = new String[10];
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter text: ");
            String text = scanner.nextLine();

            text = text.trim();
            if (text.length() == 0) {
                System.out.println("No text provided");
                continue;
            }

            if (text.equals("Enough!")) {
                System.out.println("Enough found");
                break;
            }

            System.out.println(text);

            textArray = pushTextToArray(textArray, text);


        }

        String longestString = getLongestString(textArray);
        System.out.println("Longest string is " + longestString);
    }

    public static String[] pushTextToArray(String textArray[], String text) {
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i] == null) {
                textArray[i] = text;
                break;
            }
        }

        return textArray;
    }

    // get longest string from array
    public static String getLongestString(String textArray[]) {

        String longestString = "";

        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i] != null) {
                if (textArray[i].length() > longestString.length()) {
                    longestString = textArray[i];
                }
            }
        }

        return longestString;
    }
}