public class CountOfZero {
    static int countzero(int n){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        if(rem==0){
            return 1+countzero(n/10);
        }
        else{
            return countzero(n/10);
        }
        // return n+n%10;
        

    }

    public static void main(String[] args) {
        int n= 10000;
        System.out.println(countzero( n));

    }
    
}
