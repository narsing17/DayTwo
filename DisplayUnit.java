import java.util.Scanner;

public class DisplayUnit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int thousand = 0;
        int hundreds = 0;
        int tens = 0;
        int ones = 0;

        System.out.print("Enter 4 digit number: ");

        int number = input.nextInt();

        if (number <= 9999 && number > 999) {

            thousand = number / 1000;

            System.out.println("thousands place digit: " + thousand);

            hundreds = (number / 100) % 10;

            System.out.println("Hundreds place digit: " + hundreds);

            tens = (number / 10) % 10;  // compare with your code

            System.out.println("Tens place digit: " + tens);

            ones = (number % 10);   // compare with your code

            System.out.println("Ones place digit: " + ones);

        } else {

            if (number > 9999)

                System.out.println("Error! Number more then  digits.");

            if (number < 1000)

                System.out.println("Error! Number less then 4 digits.");

        }
    }
}


