package Atividades_ternaria;
import java.util.Scanner;

public class Atv_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int x= sc.nextInt();
        String result1=(x%2==0)?("Par"):("Impar");
        String result2=(x>0)?("positivo"):("negativo");
        System.out.println(result1+" e "+result2);
    }
}