package tabuada;

import java.util.Scanner;

/**
 *
 * @author Wellington F
 */
public class Tabuada {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Entre com um número de 1 a 10: ");
        int number = leitor.nextInt();
        System.out.printf("A tabuada de %d é:\n", number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + number * i);
        }
    }
}
