package Java_Ativs.Do_While;

import java.util.Scanner;

public class Ativ_42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String texto = scanner.nextLine();
        int i = texto.length() - 1;

        do {
            System.out.print(texto.charAt(i));
            i--;
        } while (i >= 0);
    }
}
