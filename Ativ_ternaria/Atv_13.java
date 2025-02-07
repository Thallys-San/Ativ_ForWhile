package Atividades_ternaria;
import java.util.Scanner;

public class Atv_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int x= sc.nextInt();
        System.out.println("Insira outro número: ");
        int y= sc.nextInt();
        String result=(x>y)?(x+">"+y):(y+">"+x);
        System.out.println(result);
    }
}