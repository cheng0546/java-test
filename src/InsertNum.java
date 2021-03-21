public class InsertNum {
    public static int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int start = 0;
        int end = len - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + ((end - start) / 2);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end + 1;
    }

    public static void main(String[] args) {
        searchInsert(new int[]{1, 3, 5, 6}, 2);
    }

}
