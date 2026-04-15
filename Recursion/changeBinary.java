// it is does not complete there aim
public class changeBinary {

    static void binary(int n,String s){
        // base case 
        if(n==0){
            System.out.println(s);
            return;
        }
        binary(n-1, s+"0");
        binary(n-1, s+"1");

    }

    public static void main(String[] args) {
        int n=12;
        String s= "";
        // System.out.println(n, " ");
        binary(n, "");
        
    }
    
}
