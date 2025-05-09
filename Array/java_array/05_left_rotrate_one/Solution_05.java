
public class Solution_05 {

    public void rotateLeftOne(int[] arr, int length) {
        int temp = arr[0];
        for (int i = 1; i < length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[length - 1] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        Solution_05 s = new Solution_05();
        s.rotateLeftOne(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
