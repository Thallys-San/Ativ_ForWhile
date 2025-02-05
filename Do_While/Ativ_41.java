package Java_Ativs.Do_While;

import java.util.Scanner;

public class Ativ_41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String texto = scanner.nextLine();
        int i = 0;

        do {
            System.out.println(texto.charAt(i));
            i++;
        } while (i < texto.length());
    }
}
