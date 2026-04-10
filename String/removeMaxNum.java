public class removeMaxNum {

    public static void main(String[] args) {
        String s="aj3j47dnd829nh748";
        String a="";
        String b="";
        char max='0';

        for(int i=0;i<s.length();i++){
            // if(s.charAt(i)=)
            char ch =s.charAt(i);
            if(ch<='9'&& ch>='0'&& ch>max){

                max=ch;
            }
        }
        System.out.println(max);

    


    }
    
}
