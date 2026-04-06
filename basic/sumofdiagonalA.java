import java.util.Scanner;

public class sumofdiagonalA {
    public static void main(String [] args){

        int arr[][]={{2,3,4},{6,9,0},{7,3,6} };
        int n=3;
        int m=3;

        int d=6;
        boolean flag=false;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;i++){
                if(arr[i][j]==d){
                    flag= true;
                    System.out.println("found");
                    break;
                }
            }
        }
        if(!flag){
            System.out.println("not found");
        }



        // int sum=0;

        // for(int i=0;i<n;i++){
        //     sum+=arr[i][i];

        // }
        // System.out.println(sum);

        // Scanner sc=new Scanner(System.in);

        // int n = sc.nextInt();
        // int m = sc.nextInt();


        // for(int i=0; i<n ;i++){
        //     for(int j=0;j<m;j++){
        //          int arr[i][j]=sc.nextInt();

        //     }

        // }
        // int[][] transpose =new int[n][m];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         transpose[i][j]= arr[i][j];
        //     }
        // }
        // int d=6;



        // for(int i=0;i<n;i++){
        //     for(j=0;j<m;j++){


        //     }
        // }







    }
    
}
