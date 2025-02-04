import java.util.Scanner;

public class Ativ_17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.next();
        int Quantidade = palavra.length();

        for (int i = Quantidade-1; i >= 0; i--){
            System.out.print(palavra.charAt(i));
        }
    }
}