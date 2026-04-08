// package String;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter name= ");
        String name=sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
        int n = name.length();
        String nam="";

        for(int i=name.length()-1;i>=0;i--){
            //  System.out.println(name.charAt(i));
             nam=nam+name.charAt(i);

        }
        System.out.println(nam);
        if(name.equals(nam)){
            System.out.println("ye pandrome hea");
        }else{
            System.out.println("ye palindrome nahi hea");
        }


    }
    
}
