import java.util.Scanner;

public class SumaArmonica1 {
    public static void main(String[] args) {

        float sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti un numar natural de la tastatura: ");
        int n  = sc.nextInt();

        for (int i = 0; i < n; i++){
            i++;
            if (i == 1) {
                sum = sum + 1;
            } else {
                sum = sum + ((float)1 / i);
            }
        }


        System.out.println("Suma armonica este: " + sum);
    }
}
