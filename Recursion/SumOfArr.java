public class SumOfArr {
    static int sumofarr(int arr[] ,int i){
        if(i==arr.length)return 0;
        return arr[i]+sumofarr(arr,i+1);
    }

    public static void main(String[] args) {


        int arr[]={4,6,3,2,45,63,64,12,54};
        int i=0;
        System.out.println(sumofarr(arr,i));

        // System.out.println(arr);

    }
    
}
