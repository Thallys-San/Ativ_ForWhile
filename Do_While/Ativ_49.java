package Java_Ativs.Do_While;

import java.util.Random;

public class Ativ_49 {
    public static void main(String[] args) {
        Random random = new Random();
        String senha = "";
        int i = 0;

        do {
            senha += (char) (random.nextInt(26) + 'a');
            i++;
        } while (i < 6);

        System.out.println("Senha aleatória gerada: " + senha);
    }
}
