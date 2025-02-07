package Atividades_ternaria;

import java.util.Scanner;

public class Atv_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Insira um caractere: ");
        String caracter= sc.next().toLowerCase();
        String result=(caracter.equals("a") || caracter.equals("e") || caracter.equals("i") || caracter.equals("o") || caracter.equals("u"))?"vogal":"consoante";
        System.out.println(result);
        sc.close();
    }
}