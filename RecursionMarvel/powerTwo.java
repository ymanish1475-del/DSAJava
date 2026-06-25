public class powerTwo {

    public static int powerTwo(int n ,int k) {

        if(n==0){
            return 1;
        }

        k++;
        System.out.println(k);
        
        

        return 2*powerTwo(n-1,k);


        
    }
    public static void main(String[] args) {
        int n=7;
        int k=0;

        
        System.out.println(powerTwo(n,k));

        if(k%2==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }



    }
}
