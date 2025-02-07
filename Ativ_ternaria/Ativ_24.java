package Ternaria;

public class Ativ_24 {
    public static void main(String[] args) {
        int numPerfeito = 28;
        System.out.println(ehNumeroPerfeito(numPerfeito) ? "Perfeito" : "Não perfeito");
    }
    public static boolean ehNumeroPerfeito(int num) {
        int soma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }
        return soma == num;
    }
}
