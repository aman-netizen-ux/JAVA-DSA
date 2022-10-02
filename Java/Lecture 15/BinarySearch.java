public class BinarySearch {
     public static void main(String[] args) {
        int arr[]={2,0,1,10,56,91};
        int target = 20;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            // int mid = (start+end)/2;
            // it might be possible that this mid value might exceed the range of integers so to clear this problem we can do 
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}