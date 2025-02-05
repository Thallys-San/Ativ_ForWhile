package Java_Ativs;

public class Ativ_23 {
    public static void main(String[] args) {
        System.out.println("Números divisíveis por 4 entre 1 e 200:");
        for (int i = 1; i <= 200; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
