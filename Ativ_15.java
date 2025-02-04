public class Ativ_15 {
    public static void main(String[] args) {
        for (int i=0;i<101;i++){
            if (i%3==0){
                System.out.println("Fizz");
            } else if (i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
