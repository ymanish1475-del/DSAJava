// package basic;

import java.util.Scanner;

public class newone {

    // public static int add(int a , int b){

    //     return a+b;
    // }
    public static int count( int c, int d){

        int coun = 0;

        while(c>0){

            int rem= c%10;

            if(rem==d){

                count++;
                c=c/10;

            }
            return count;

            
        }
        





    }


    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        // int a=sc.nextInt();
        // int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        // int sum = add(a,b);

        int countt = count(c,d);

        // System.out.println(sum);
        System.out.println(countt);


    }
    
}
