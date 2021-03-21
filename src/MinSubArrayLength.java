public class MinSubArrayLength {

    public static int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int start = 0;
        int end = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (end < len) {
            sum += nums[end];
            while (sum >= target) {
                min = Math.min(end - start + 1, min);
                sum -= nums[start++];
            }
            end++;
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }

    public static void main(String[] args) {
        int result = minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        System.out.println(result);
    }

}
