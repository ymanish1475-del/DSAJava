// package RecursionMarvel;

public class newOne {

    public static void print(int n){

        

        if(n==1){
            return;
        }

        System.out.println(n +" ");
        // System.out.println();
        print(n-1);
        // System.out.println(1);

       
        // sum=sum+n
        

        // System.out.println(n);
        
    }

    public static int  sum(int n,int sum) {
        
          print(n);
        // System.out.println(1);

       
       return sum=sum+n;

    }
    public static void main(String [] args){

        // print(10);
         int sum=0;
       System.out.println(sum(10,sum)); 
    }
}
