package Java_Ativs.Do_While;

import java.util.Scanner;

public class Ativ_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para ver sua tabuada: ");
        int numero = scanner.nextInt();
        int i = 1;

        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        } while (i <= 10);
    }
}
