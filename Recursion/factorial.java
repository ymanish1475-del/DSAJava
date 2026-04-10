// package Recursion;

public class factorial {
     static int facto(int n){
        // for(i=1;i<=n;i++);
        if(n==1)return 1;
        return n*facto(n-1);

        

    }
    public static void main(String[] args) {
        // fact(5);
        System.out.println(facto(5));

        
    }
    
}
