public class StringMinusChar {
    public static void main(String[] args) {
        String str="bnmuswhw";
        char a='w';
        String result="";

        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)!=a){
                result+=str.charAt(i);
                // str=str-a;


            }
        }
        System.out.println(result);


    }
    
}
