import static java.util.Arrays.*;

public class NumberOccurenceInArray1 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 1, 3, 1};
        sort(numbers); // 1 1 1 2 3 3 4 5 6


        int noOfOccurence;
        int i = 0;

        while (i < numbers.length - 1) {
            noOfOccurence = 1;
            int j = i + 1;
            while (j < numbers.length) {
                if (numbers[i] == numbers[j]) {
                    noOfOccurence++;
                    j++;
                } else {

                    if (noOfOccurence > 1)
                        System.out.println(numbers[i] + " apare de: " + noOfOccurence + " ori");
                    //setam pozitia elementului i=pozitia elementului j, deoarece
                    //array a fost sortat si fostele pozitii apartin elementului curent i
                    i = j;
                    break;
                }
            }
        }


    }

}
