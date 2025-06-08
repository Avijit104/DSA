
public class Solution_24 {
    void reverse(int[] arr, int left, int right) {
        System.out.println();
        int temp;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    void nextPermutation(int[] arr) {
        int pivot = -1;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                pivot = i - 1;
                break;
            }
        }
        if (pivot == -1) {
            reverse(arr, pivot, arr.length - 1);
            return;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[pivot]) {
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }

        reverse(arr, pivot + 1, arr.length - 1);

    }

    public static void main(String[] args) {
        Solution_24 s = new Solution_24();
        int[] arr = { 2, 4, 1, 7, 5, 0 };
        s.nextPermutation(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ,");
        }
        System.out.println();
    }
}
