public class Solution_09 {
    public int linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 7, 8, 4, 1 };
        int num = 40;
        Solution_09 s = new Solution_09();
        System.out.println(s.linearSearch(arr, num));
    }
}
