public class PathInGrid {

    static void path(String str,int n ,int m){

        // base case 
        if(n==1 && m==1){
            System.out.println(str);
            return;
        }
        if(n>1) path(str+"D",n-1,m);
        if(m>1) path(str+"R",n,m-1);

    }


    public static void main(String[] args) {
        int n=3;
        int m=3;
        path("",n,m);

    }
    
}
