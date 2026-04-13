public class XPowerN {

    static int power(int x,int n){
        if(n==0) return 1;
        // int ans=1;
        // return x*(x-n);
        return x*power(x,n-1);



    }
    // System.out.println(ans);
    public static void main(String[] args) {
        // xpowern(5, 5);
        // System.out.println(ans);
        int x=2;

        int n=3;
        System.out.println(power(x,n));

    }
    
}
