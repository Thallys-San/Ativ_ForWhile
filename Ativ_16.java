import java.util.Scanner;

public class Ativ_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.next();
        int Quantidade = palavra.length();

        for (int i = 0; i  < Quantidade; i++){
            System.out.print(palavra.charAt(i));
        }
    }
}