public class DigitCount {
    static int digitcount(int n){
        // int count=0;
        if(n==0){
            return 0;
        }
        return 1+digitcount(n/10);
        // if(n%)
    }
    public static void main(String[] args) {
        int n = 7885897;
        System.out.println(digitcount( n));

    }
    
}
