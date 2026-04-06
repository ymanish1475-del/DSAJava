public class one {
    public static void main(String [] args){

        // FIXED: Correct 2D array initialization
        int[][] arr = {
            {2, 3, 4},
            {6, 9, 0},
            {7, 3, 6}
        };

        int top=0;
        int bottom=arr.length-1;
        int left=0;
        int right= arr[0].length-1;
        
        // step 1=left to right
        while(top<=bottom && left<=right){

            for(int i=left;i<=right;i++){
                System.out.println(arr[top][i]+" ");
            }
            top++;

            // step2 top to bottom
            for(int i=top;i<=bottom;i++){
                System.out.println(arr[i][right]+" ");
            }
            right--;

        }

        
        // int n = 3; // rows
        // int m = 3; // columns
        // int d = 6; // target element to find
        // boolean flag = false;

        // for(int i = 0; i < n; i++){
        //     // FIXED: Increment 'j', not 'i'
        //     for(int j = 0; j < m; j++){
        //         if(arr[i][j] == d){
        //             flag = true;
        //             System.out.println("found at row " + i + ", column " + j);
        //             break; // Breaks the inner loop
        //         }
        //     }
        //     // Optional: If you only want to find it once, break the outer loop too
        //     if (flag) {
        //         break;
        //     }
        // }
        
        // if(!flag){
        //     System.out.println("not found");
        // }
    }
    
}
