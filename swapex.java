import java.util.*;
public class swapex {
    public static void main(String args[]){
        int[] arr={1,2,30,6,9};
        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));


    }
    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    
    // output[1, 2, 9, 6, 30]
}
