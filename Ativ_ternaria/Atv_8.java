package Atividades_ternaria;

import java.util.Scanner;

public class Atv_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um nota: ");
        double nota= sc.nextDouble();
        String result=(nota>=7.0)?("Aprovado"):("Reprovado");
        System.out.println(result);
    }
}