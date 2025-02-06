package Atividades_ternaria;

import java.util.Scanner;

public class Atv_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Informe um numero:");
        int num= sc.nextInt();
        String result=(num%5==0)?"Múltiplo de 5":"Não é múltiplo de 5";
        System.out.println(result);
    }
}