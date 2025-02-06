package Atividades_ternaria;

import java.util.Scanner;

public class Atv_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Insira sua idade: ");
        int age= sc.nextInt();
        String result=(age>=18)?"Maior de idade":"Menor de idade";
        System.out.println(result);
    }
}
