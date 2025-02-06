package Atividades_ternaria;

import java.util.Scanner;

public class Atv_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int x= sc.nextInt();
        String result=(x>100)?("alto"):("baixo");
        System.out.println(result);
    }
}