import java.util.Scanner;

public class Fibonacci {

    static int fibonacci(int n){
        if(n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);






    }

    public static void main(String[] args) {
        // int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n = ");
        int n=sc.nextInt();
        // int n=16;
        System.out.println(fibonacci(n));
        
    }
    
}
