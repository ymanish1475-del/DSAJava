public class CountOfVowelInString {
    static int vowel(String str,int i){
        if(i==str.length())return 0;
        char ch = str.charAt(i);
        int count =(ch=='a'||ch=='i'||ch=='o'||ch=='e'||ch=='u')?1:0;
        return count +vowel(str,i+1);

        



    }
    public static void main(String [] args){
            String str = "helloienhd";
            int i=0;
            System.out.println(vowel(str,i));
        }
    
}
