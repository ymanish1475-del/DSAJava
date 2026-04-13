public class ReplaceNumInArr {

    static int replacenum(int [] arr,int i){
        if(i==arr.length) return;
        if(arr[i]==2)arr[i]=5;
        replacenum(arr,i+1);

    }

    public static void main(String[] args) {
        int arr[]={6,5,3,6,7,3,244,5,2,2,2};
        int i=0;
        System.out.println(replacenum(arr,i));
        
    }
    
}
