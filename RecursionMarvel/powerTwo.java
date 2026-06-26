public class powerTwo {

    public static int powerTwo(int n ,int k) {

        if(n==0){
            return 1;
        }

        k++;
        // System.out.println(k);
        
        int power = 2*powerTwo(n-1,k);

        return power;
        


        
    }
    public static void main(String[] args) {
        int n=10;
        int k=0;

        
        // System.out.println(powerTwo(n,k));
        int p=powerTwo(n, k);

        if(p%2==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }



    }
}
