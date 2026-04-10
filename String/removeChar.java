public class removeChar {
    public static void main(String[] args) {
        // String s="vsgnsdyswnwwnnnnnagsggsg";
        String s="aaabbbcccdddeeefffgg";
        String result=" ";
        result+=s.charAt(0);

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                result+=s.charAt(i);

            }

        }
        System.out.println(result);
    }
 
    
}
