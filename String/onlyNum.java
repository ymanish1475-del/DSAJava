public class onlyNum {
    public static void main(String[] args) {
        String s="267287272";
        boolean isn=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<'0'||s.charAt(i)>'9'){
                isn=false;
            }
        }

        System.out.println(isn);
    }
    
}
