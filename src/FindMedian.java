public class FindMedian {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int[] nums = new int[len];
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        while (index1 < nums1.length || index2 < nums2.length) {
            if (index1 >= nums1.length) {
                nums[index++] = nums2[index2++];
            } else if (index2 >= nums2.length) {
                nums[index++] = nums1[index1++];
            } else {
                if (nums1[index1] >= nums2[index2]) {
                    nums[index++] = nums2[index2++];
                } else {
                    nums[index++] = nums1[index1++];
                }
            }
        }
        double result;
        if (len % 2 == 0) {
            result = (Double.valueOf(nums[len / 2 - 1]) + Double.valueOf(nums[len / 2])) / 2;
        } else {
            result = Double.valueOf(nums[len / 2]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
