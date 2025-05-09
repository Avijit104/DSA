import java.util.HashMap;

class Solution_14 {
    public int appearsOnceHashmap(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.get(arr[i]) == null) {
                hashMap.put(arr[i], 1);
            } else {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            }
        }
        for (Integer i : hashMap.keySet()) {
            if (hashMap.get(i) == 1) {
                return i;
            }
        }
        System.out.println(hashMap);
        return 0;
    }

    // Optimal Solution
    public int appearsOnce(int[] arr) {
        int xor1 = 0;
        for (int i = 0; i < arr.length; i++) {
            xor1 = xor1 ^ arr[i];
        }
        return xor1;
    }

    public static void main(String[] args) {
        Solution_14 s = new Solution_14();
        int arr[] = { 1, 1, 2, 3, 3, 4, 4, 5, 5 };
        System.out.println(s.appearsOnceHashmap(arr));
        System.out.println(s.appearsOnce(arr));
    }
}