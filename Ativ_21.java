import java.util.Scanner;

public class Ativ_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        int soma = 0;
        int numDigitos = (int) Math.log10(numero) + 1;

        for (int i = 0; i < numDigitos; i++) {
            soma += numero % 10; // Adiciona o último dígito
            numero /= 10; // Remove o último dígito
        }

        System.out.println("A soma dos dígitos é: " + soma);
    }
}
