/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peak(mountainArr);

        int firstTry = OrderAgnosticBS(mountainArr, target, 0, peak);

        if (firstTry != -1) {
            return firstTry;
        }

        return OrderAgnosticBS(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }

    // Find peak element
    static int peak(MountainArray mountainArr) {

        int s = 0;
        int e = mountainArr.length() - 1;

        while (s < e) {

            int mid = s + (e - s) / 2;

            // Store values instead of calling get() multiple times
            int midValue = mountainArr.get(mid);
            int nextValue = mountainArr.get(mid + 1);

            if (midValue > nextValue) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }

        return s;
    }

    static int OrderAgnosticBS(MountainArray mountainArr, int target, int s, int e) {

        // Find order only once
        boolean isAsc = mountainArr.get(s) < mountainArr.get(e);

        while (s <= e) {

            int mid = s + (e - s) / 2;

            // Call get() only once
            int midValue = mountainArr.get(mid);

            if (midValue == target) {
                return mid;
            }

            if (isAsc) {

                if (midValue < target) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }

            } else {

                if (midValue > target) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }

        return -1;
    }
}