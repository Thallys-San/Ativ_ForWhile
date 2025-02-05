package Java_Ativs.Do_While;

import java.util.Scanner;

public class Ativ_54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;

        do {
            System.out.print("Informe um número: ");
            numero = scanner.nextDouble();

            if (numero >= 0) {
                System.out.println("Raiz quadrada: " + Math.sqrt(numero));
            }
        } while (numero >= 0);
    }
}
