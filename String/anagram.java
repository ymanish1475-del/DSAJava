// package String;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("ENTER STRING 1 = ");
        String str=sc.nextLine();
        System.out.print("ENTER STRING 2 = ");
        String st=sc.nextLine();


    // String str="silent";

    // String st ="listen";

    char[] a=str.toCharArray();
    char[] b=st.toCharArray();

    Arrays.sort(a);
    Arrays.sort(b);

    if(Arrays.equals(a,b)){
        System.out.println("anagram");
    }else{
        System.out.println("faaaa");
    }
        
    }
    

}
