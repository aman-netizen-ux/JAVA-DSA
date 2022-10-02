public class OrderAgnosticBS {
    public static void main(String[] args) {
        int arr[]={91,56,42,30,2,-1,-10,-12};
        int target = -12;
        int ans= orderAgBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgBS(int[] arr, int target){
        int start=0;
        int end = arr.length-1;

        // find whether the array is sorted or not
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc=true;
        }else{
            isAsc=false;
        }
        while(start<=end){
            // int mid = (start+end)/2;
            // it might be possible that this mid value might exceed the range of integers so to clear this problem we can do 
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }else{
                if(target>arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
            
        }
        return -1;
    }
}
