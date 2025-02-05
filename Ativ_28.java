package Java_Ativs;

public class Ativ_28 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        int soma = 0;

        for (int num : vetor) {
            soma += num;
        }

        double media = soma / (double) vetor.length;
        System.out.println("A média dos números do vetor é: " + media);
    }
}
