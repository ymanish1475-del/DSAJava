public class NumReverse {
    
     static int reverse(int num){
        int rev=0;
        if (num==0) {
            return rev;
        }
        rev = rev*10+num%10;
        return reverse(num/10);







    }

    public static void main(String[] args) {
        int num = 638276;
        System.out.println(reverse(num));

    }
    
}
