package Atividades_ternaria;

import java.util.Scanner;

public class Atv_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Insira sua idade: ");
        int age= sc.nextInt();
        System.out.println("Você possui habilitação?(s/n): ");
        String habilit= sc.next().toLowerCase();
        String result=(age>=18 && habilit.equals("s"))?"Você pode dirigir!":"voce NÃO pode dirigir";
        System.out.println(result);
    }
}