// package String;

import java.util.Scanner;

public class basicString {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("name= ");

        String name = sc.nextLine();

        // String name="ankit kumar rajak"; - kumar
        System.out.println(name);
        System.out.println(name.length());
        int n = name.length();
        String nam="";
        for(int i=name.length()-1;i>=0;i--){
            //  System.out.println(name.charAt(i));
             nam=nam+name.charAt(i);

        }
        System.out.println(nam);

       

        // for()
        // System.out.println(name.substring(0,4));
        // System.out.println(name.replace('o', 'n'));
        // System.out.println(name.toUpperCase());
        // System.out.println(name.toLowerCase());
            
        }

    
}
