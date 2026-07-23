class Solution {
    public int search(int[] arr, int target) {
      int pivot = FindPivot(arr);
        //if you did not find the pivot , it means array is not rotated
        if(pivot == -1){
           //just do normal binary search
           return BS(arr,target,0,arr.length -1);
        }
        //if pivot is found , you have found 2 asc sorted arrays
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
           return BS(arr,target,0,pivot-1);
        }
        else{
            return BS(arr,target,pivot+1,arr.length -1);
        }
    }

    static int FindPivot(int[] arr){
        int s = 0;
        int e = arr.length -1;
        while(s<= e){
            int mid = s + (e-s)/2;
            //4 cases over here
            if(mid < e && arr[mid] > arr[mid +1]){
                return mid;
            }
            if(mid > s && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[s] >= arr[mid]){
                e = mid -1;
            }
            if(arr[s] < arr[mid]){
                s = mid + 1;
            }
        }
        //at the end start and end will be at same position
        return -1;
    }

    static int BS(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                start = mid +1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

}

