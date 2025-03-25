import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sumArray = arrayMerge(nums1, nums2);
        Arrays.sort(sumArray);

        int length = sumArray.length;
        if (length % 2 == 0) {
            return (double) (sumArray[length / 2 - 1] + sumArray[length / 2]) / 2.0;
        } else {
            return (double) sumArray[length / 2];
        }
    }

    public int[] arrayMerge(int[] nums1, int[] nums2) {
        int[] sumArray = new int[nums1.length + nums2.length];
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            sumArray[index++] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            sumArray[index++] = nums2[i];
        }

        return sumArray;
    }
}