package algorithms;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {36,19,29,12,5};
        bubbleSort(arr);
        for(int i : arr){
            System.out.println(i);
        }

    }

    public static void bubbleSort(int arr[]) {
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                return;
            }

        }
    }
}
