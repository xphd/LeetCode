public class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            if (nums[left] <= nums[mid]){
                if (nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            else {
                if (nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }
        if (nums[left] == target) return left; // left = right
        return -1;
    }
}