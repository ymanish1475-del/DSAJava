public class EvenSumInArr {
    static int evensum(int [] arr , int i){
        if(i==arr.length)return 0;
        int val=(arr[i]%2==0)?arr[i]:0;
        return val+evensum(arr,i+1);
    }
    
    public static void main(String[] args) {
        int arr[]={2,3,5,4,5,4,6,3,3};
        int i=0;
        System.out.println(evensum(arr,i));
        
    
}
}