class Solution {
    public int searchInsert(int[] nums, int target) {
      int low = 0;
        int hi = nums.length - 1;
        int mid = 0;

        if (target > nums[hi]) {
            return hi + 1;
        } else if (target <= nums[low]) {
            return 0;
        }
        while (mid!=hi) {
            mid = low + ((hi - low) / 2);
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid] && target < nums[mid+1] ) {
                return mid+1;
            } else if (target < nums[mid]) {
                hi = mid - 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            }
        }
        return mid;
    }
}