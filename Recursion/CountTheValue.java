// public class CountTheValue {
//     static int counter(int arr[],int a,int i){
//         if(i==arr.length)return 0;
//         int count = (arr[i]==a)? 1:0;
//         return count + counter(arr,i+1,a);

//     }

//     public static void main(String[] args) {
//         int arr[]={4,6,4,6,8,4,224,46,75};
//         int a=4;
//         int i =0;
//         System.out.println(counter(arr,a,i));

//     }
    
// }
public class CountTheValue {
    static int counter(int arr[],int a,int i){
        if(i==arr.length)return false;
        boolean count = (arr[i]==a)return true;
        return count + counter(arr,i+1,a);

    }

    public static void main(String[] args) {
        int arr[]={4,6,4,6,8,4,224,46,75};
        int a=4;
        int i =0;
        System.out.println(counter(arr,a,i));

    }
    
}
