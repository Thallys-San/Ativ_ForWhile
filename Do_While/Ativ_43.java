package Java_Ativs.Do_While;

import java.util.Scanner;

public class Ativ_43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        int soma = 0;

        do {
            soma += numero % 10;
            numero /= 10;
        } while (numero > 0);

        System.out.println("A soma dos dígitos é: " + soma);
    }
}
