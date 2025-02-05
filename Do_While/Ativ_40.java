package Java_Ativs.Do_While;

import java.util.Scanner;

public class Ativ_40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contador = 0;

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            contador++;
        } while (numero != 0);

        System.out.println("Você digitou " + (contador - 1) + " números antes de digitar zero.");
    }
}
