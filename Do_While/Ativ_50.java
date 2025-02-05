package Java_Ativs.Do_While;

import java.util.Scanner;

public class Ativ_50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "1234";
        String senha;

        do {
            System.out.print("Informe a senha: ");
            senha = scanner.nextLine();
        } while (!senha.equals(senhaCorreta));

        System.out.println("Senha correta!");
    }
}
