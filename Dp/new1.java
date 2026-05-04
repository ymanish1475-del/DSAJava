// package Dp;

import java.util.Arrays;
import java.util.Scanner;

public class new1 {

    static int minStep(int n,int [] dp){
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];
        dp[n] = minStep(n-1,dp)+(n-1)*minStep(n-2,dp);

        return dp[n];
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        // int n=3;
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(minStep(n,dp));
    }
    
}
