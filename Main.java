import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args ) {

        Scanner sc = new Scanner(System.in);

        int Valor1, Valor2, Soma;

        Valor1 = sc.nextInt();
        Valor2 = sc.nextInt();

        Soma = Valor1 + Valor2;

        System.out.println("SOMA = " + Soma);

        sc.close();
    }


}