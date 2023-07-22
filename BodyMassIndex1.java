import java.util.Scanner;

public class BodyMassIndex1
{
    public static void main(String[] args) {
/*        int height=167;
        float weight=114.5f;*/


        Scanner scanner = new Scanner(System.in);
        System.out.print("greutate: ");
        int weightNew = scanner.nextInt();
        System.out.print("inaltime:");
        float heightNew = scanner.nextFloat();

        int heightSquared = (int) Math.pow(heightNew, 2);
        System.out.println("h la patrat: " + heightSquared);

        float bmi = weightNew / heightSquared  * 1000;
        System.out.println("BMI este: " + bmi);

        interpretBMI(bmi);

    }

    public static void interpretBMI(float bmi){
        if (bmi>=18.5 && bmi<=24.9f)
            System.out.println("Your weight is normal, so bmi is good");
        else
            System.out.println("Your weight is anormal");
    }
}
