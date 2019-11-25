package algorithms;

import com.sun.xml.internal.ws.api.client.WSPortInfo;

import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = { 15,9,12,13,16,4,18,11};
        int len = arr.length;
        quicSortRecursion(arr,0,len-1);
        for(int i: arr){
            System.out.println(i);
        }

    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[(low+ high)/2];

        while(low <= high){
             while(arr[low] < pivot){
                 low++;
             }
             while(arr[high] > pivot){
                 high --;
             }
             if(low <= high){
                 exchangeNumbers(arr,low,high);
                 low++;
                 high--;
             }
        }
        return low;

    }

    public static void  quicSortRecursion(int[] arr,int low,int high){
        int pi = partition(arr,low,high);
        if(low < pi - 1){
            quicSortRecursion(arr,low,pi -1);
        }
        if(pi < high){
            quicSortRecursion(arr,pi,high);
        }
    }

    public static void exchangeNumbers(int []arr,int low, int high){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }

}
