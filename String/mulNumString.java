public class mulNumString {
    public static void main(String[] args) {
        String s="5";
        String t="16";
        int n=0;
        int m=0;
        for(int i=0;i<s.length();i++){
            n=n*10+(s.charAt(i)-'0');
        }
        for(int i=0;i<t.length();i++){
            m=m*10+(s.charAt(i)-'0');
        }
        System.out.println(m*n);
    }
    
}
