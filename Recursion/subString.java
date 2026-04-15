public class subString {

    static void subst(String s ,String up){
        // base case 
        if(up.isEmpty()){
            System.out.println(s);
            return;
        }
        char ch = up.charAt(0);

        // return s.charAt(i);
        // include
        subst(s+ch,up.substring(1));
        // exclusive
        subst(s, up.substring(1));



    }

    public static void main(String[] args) {
        String s="abc";
        subst("",s);
        // int i =0;
        System.out.println(subst(s));

    }
    
}
