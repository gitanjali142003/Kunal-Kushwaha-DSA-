public class maxitem {
    public static void main(String args[]){
        int [] arr={100,2,89,90};
       
        System.out.println(max(arr));
        System.out.println(minval(arr));
    }

    static int max(int[] arr){
        int maxval=arr[0];
        for(int i=1;i<arr.length;i++){
            if(maxval<arr[i]){
                maxval=arr[i];
                 
            }
            
            
        }
        return maxval;
        
        
        
    }
    static int minval(int []arr){
        int minval=arr[0];
        for(int i=0;i<arr.length;i++){
            if(minval>arr[i]){
                minval=arr[i];
            }
        }
        return minval;
    } 
   
    
}
