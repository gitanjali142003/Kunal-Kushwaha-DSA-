import java.util.*;
public class reverseex {
    public static void main(String args[]){
        int [] arr={4,5,67,34,100};
        reverseval(arr);//when we return function as void then we cahe to firstly call function as like otherwise call
        //System.out.println(Arrays.toString(reverseval(arr)));
        System.out.println(Arrays.toString(arr));

    }
    static void reverseval(int []arr){
        
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swapex(arr,start,end);
            start++;
            end--;
        }
    }

    static void swapex(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
    
} 
