public class Solution_19 {
    public void sortCount(int[] arr) {
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                cnt0++;
            } else if (arr[i] == 1) {
                cnt1++;
            } else {
                cnt2++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < cnt0) {
                arr[i] = 0;
            } else if (i < cnt1 + cnt0) {
                arr[i] = 1;
            } else {
                arr[i] = 2;
            }
        }

    }

    // Optimal Solution
    public void sortDuchOptimal(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }

            else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        Solution_19 s = new Solution_19();
        s.sortDuchOptimal(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
