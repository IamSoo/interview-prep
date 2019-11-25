package common;

public class RotateArray {

    public static void main(String[] args) {
        int [] input = {5,6,7,8,9,10};
        //rotateArray(input,3);
        rotateArrayByBubble(input,3);
    }



    public static void rotateArray(int [] arr,int k){
        int [] result = new int[arr.length];

        for(int i = 0; i < k ; i ++){
            result[i] = arr[arr.length - k + i];
        }
        int j=0;
        for(int i=k; i<arr.length; i++){
            result[i] = arr[j];
            j++; }
       for(int i : result){
           System.out.println(i);
       }

        System.arraycopy( result, 0, arr, 0, arr.length );
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void rotateArrayByBubble(int [] arr,int k){
        for(int i = 0;i < k; i++){
            for (int j = arr.length - 1; j>0; j-- ){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }

        for(int i : arr){
            System.out.println(i);
        }
        }

}
