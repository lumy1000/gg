import java.util.Scanner;

public class StutterWords2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String text = scanner.nextLine();

        String[] words = text.split(" ");
        System.out.println("Nr cuvinte: " + words.length);

        //var 1:
        System.out.print("varianta i - Words: ");
        String stutterWord="";

        for (String word : words) {
            stutterWord += word + " " + word + " ";
        }

        System.out.println(stutterWord);

        //var 2:
        System.out.print("varianta ii - Words: ");
        StringBuilder stutterWordsNew = new StringBuilder();

        for (String word : words){
            for (int i= 0; i <2; i++){
                stutterWordsNew.append(word).append(" ");
            }

        }
        System.out.println(stutterWordsNew);


    }
}
