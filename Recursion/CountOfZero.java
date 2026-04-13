public class CountOfZero {
    static int countzero(int n){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        if(rem==0){
            return 1+n;
        }
        // return n+n%10;
        

    }

    public static void main(String[] args) {
        int n= 567080;
        System.out.println(countzero( n));

    }
    
}
