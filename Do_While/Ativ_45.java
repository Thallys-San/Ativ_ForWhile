package Java_Ativs.Do_While;

import java.util.Scanner;

public class Ativ_45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor máximo para a sequência de Fibonacci: ");
        int max = scanner.nextInt();
        int a = 0, b = 1;

        do {
            System.out.println(a);
            int temp = a;
            a = b;
            b = temp + b;
        } while (a <= max);
    }
}
