// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main1 {
    public static void main(String[] args) {
/*

        int sum=0;

        for (int i=0; i<6; i++){
            if (i % 2 == 0) {
                sum +=i; //sum = sum + i
            }
        }
        System.out.println("Sum ov even numbers from 0 to 1000 is: " + sum);

*/

/*        int sumOddNumbers=0;
        int j = 0;
        while (j < 1000) { //body of the loop
            if (j %2 !=0){
                sumOddNumbers +=j;
            }
            j++;
        }
        System.out.println("Suma numerelor impare este: " + sumOddNumbers);*/
/*
        int sumEvenNumbers = 0;
        for (int k=0; k<1000; k++){
            if (k % 2 == 0) {
                sumEvenNumbers += k;
            }
            k++;
        }*/

/*        int result1=sumN1(9);
        System.out.println("Rezultatul este: " + result1);*/

        int result0 = addNumbers(100);
        System.out.println("Sum of n numbers recursive (even only): " + result0);
    }

    public static int sumN1(int n){
        if (n>0) {
            System.out.println(n);
            return n + sumN1(n-2);
        }
        else {
            return 0;
        }
    }



    public static int addNumbers(int n){
        if ( n % 2 != 0)
            n--;
         return sumN(n);
    }


    public static int sumN(int n){
        if (n>0) {
            return n + sumN(n - 2);
        } else {
            return 0;
        }
    }
}