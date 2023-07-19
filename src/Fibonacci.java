import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(fibo(input));

    }

    static int fibo(int input) {
        if(input==0){
            return 0;
        } else if (input==1) {
            return 1;
        }
        return fibo(input-1)+fibo(input-2);
    }
}
