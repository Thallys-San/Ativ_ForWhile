package Atividades_ternaria;

import java.util.Scanner;

public class Atv_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int x= sc.nextInt();
        String result=(x>0&&x%2==0)?("Sim"):("Não");
        System.out.println(result);
    }
}