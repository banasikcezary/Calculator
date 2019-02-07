import java.util.Scanner;

public class kalkulator {

    public static void main(String []args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę ");

        int a = input.nextInt();

        System.out.println(" Podaj drugą liczbę: ");
        int b = input.nextInt();

        input.nextLine();


        System.out.println("Podaj żądaną operacje: [  +  -  /  *  ]");
        String operacja = input.nextLine();

        Calculate calc = new Calculate();

        int result = calc.operator(a, b, operacja);

        System.out.println(a + operacja + b + "=" + result);

        input.close();










    }
}
