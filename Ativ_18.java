import java.util.Scanner;
public class Ativ_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma string:");
        String input=sc.next().toLowerCase();
        boolean palindromo=true;
        for (int i=0;i<input.length()/2;i++){
            if (input.charAt(i)!=input.charAt(input.length()-1-i)){
                palindromo=false;
                break;
            }
        }
        if (palindromo) {
            System.out.println(input+" é um palindromo.");
        }else {
            System.out.println(input+" NÃO é um palindromo.");
        }
        }
    }