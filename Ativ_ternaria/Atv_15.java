package Atividades_ternaria;

import java.util.Scanner;

public class Atv_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Informe um numero:");
        int num= sc.nextInt();
        String result=(num%3==0&&num%5==0)?"FizzBuzz":num+("");
        System.out.println(result);
    }
}