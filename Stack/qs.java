// import java.util.Stack;

import java.util.Stack;

public class qs {
    public static void main(String[] args) {
        String num="1178374738";
        int k=4;

        // Stack <Integer> st = new  Stack<>();
        Stack<Character> st = new Stack<>();

        for(char digit : num.toCharArray()){
            while(!st.empty()&& k>0&& st.peek()>digit){
                st.pop();
                k--;
            }
            st.push(digit);
        }
        while(k-->0){
            st.pop();
        }
        StringBuilder sb =new StringBuilder();
        for(char ch:st){
            sb.append(ch);
        }
        System.out.println(sb);
    }

}
