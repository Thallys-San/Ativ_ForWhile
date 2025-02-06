package Atividades_ternaria;

import java.util.Scanner;

public class Atv_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Informe um ano:");
        int ano= sc.nextInt();
        String result=(ano%4==0 && ano%100!=0||ano%400==0)?ano+" é bissexto":ano+" não é bissexto";
        System.out.println(result);
    }
}