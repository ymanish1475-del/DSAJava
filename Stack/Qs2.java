import java.util.Stack;

public class Qs2 {
    public static void main(String[] args) {
        String s="3[a]2[bc]";
        Stack<Integer> st = new Stack<>();
        Stack<Integer> countSt = new Stack<>();
        String curr ="";
        int num=0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num= num*10+(ch-'0');
            }
            else if(ch=='['){
                countSt.push((num));
                str.Stack.push(curr);
                num=0;
                curr="";
            }else if(ch==']'){
                countSt.pop((num));
                str.Stack.push(curr);
            }else {
                
                curr += ch;
            }

        }
        System.out.println(curr);

    }
}
