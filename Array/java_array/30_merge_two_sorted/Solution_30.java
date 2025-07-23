import java.util.Arrays;

public class Solution_30 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = Arrays.copyOfRange(nums1, 0, m);
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (temp[i] < nums2[j]) {
                nums1[k] = temp[i];
                i++;
            } else {
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (j < n) {
            nums1[k] = nums2[j];
            j++;
            k++;

        }
        while (i < m) {
            nums1[k] = temp[i];
            i++;
            k++;

        }
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int nums2[] = { 2, 5, 6 };
        int n = 3;
        Solution_30 s = new Solution_30();
        s.merge(nums1, m, nums2, n);
        for (int i : nums1) {
            System.out.print(i + " ");
        }
    }

}
