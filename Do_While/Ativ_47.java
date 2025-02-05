package Java_Ativs.Do_While;

import java.util.Scanner;

public class Ativ_47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        int i = 2;
        boolean primo = true;

        do {
            if (numero % i == 0) {
                primo = false;
                break;
            }
            i++;
        } while (i <= numero / 2);

        if (primo && numero > 1) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }
    }
}
