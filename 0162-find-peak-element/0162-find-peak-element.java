class Solution {
    public int findPeakElement(int[] arr) {
         int s = 0;
        int e = arr.length -1;
        while(s< e){
            int mid = s + (e - s)/2;
            if(arr[mid+1] < arr[mid]){
                // you are in decreasing part of the array
                // this may be the ans, but look at left
                e = mid;
            }else{
                //you are in ascending part of the array
                s = mid + 1;

            }
        }
        //at the end s & e are at same element
        return s;
    }
}
