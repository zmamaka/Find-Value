import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nbr, tempNumber, placeValue, total = 0;

        System.out.print("Sayı giriniz => ");
        nbr = scan.nextInt();

        tempNumber = nbr;

        while (tempNumber != 0){

            placeValue = tempNumber % 10;

            total += placeValue;

            tempNumber /= 10;

        }

        System.out.print(total);

    }
}
