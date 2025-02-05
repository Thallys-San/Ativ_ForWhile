package Java_Ativs.Do_While;

import java.util.Scanner;

public class Ativ_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Informe um número: ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                System.out.println("Número positivo: " + numero);
            }
        } while (numero >= 0);
    }
}
