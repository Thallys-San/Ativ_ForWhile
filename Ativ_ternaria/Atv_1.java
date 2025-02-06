package Atividades_ternaria;

import java.util.Scanner;

public class Atv_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Informe um numero:");
        int num= sc.nextInt();
        String result=(num%2==0)?num+" é par":num+" é impar";
        System.out.println(result);
    }
}