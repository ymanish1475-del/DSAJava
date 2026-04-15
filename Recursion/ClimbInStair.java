public class ClimbInStair {

    static int climbs(int n){
        if(n==1 || n==0){
            return 1;

        }
        return climbs(n-1)+climbs(n-2);
    }

    public static void main(String[] args) {
        int n=4;
        int a=1;
        int b=2;
        System.out.println(climbs(n));

    }
    
}
