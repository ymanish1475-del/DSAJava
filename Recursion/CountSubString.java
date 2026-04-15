// COUNT THE NUM OF SUB STRING 
public class CountSubString {
    static int subset(String s){
        if(s.isEmpty()){
            return 1;
        }
        return subset(s.substring(1))+subset(s.substring(1));


    }

    public static void main(String[] args) {
        String s="abFc";
        System.out.println(subset(s));
    }
    
}
