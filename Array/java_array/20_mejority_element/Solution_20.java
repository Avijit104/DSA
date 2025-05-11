import java.util.*;

public class Solution_20 {
    public int mejorityElementHashmap(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : arr) {
            if (hashMap.get(i) == null) {
                hashMap.put(i, 1);
            } else {
                hashMap.put(i, hashMap.get(i) + 1);
                if (hashMap.get(i) > arr.length / 2) {
                    return i;
                }
            }
        }
        return -1;
    }

    // Optimal Soluton using moore's voting algorithm
    public int majorityElementOptimal(int arr[]) {
        int el = arr[0];
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (el == arr[i]) {
                cnt++;
            } else {
                cnt--;

            }
            if (cnt == 0) {
                el = arr[i + 1];
            }
        }
        int cnt2 = 0;
        for (int i : arr) {
            if (el == i) {
                cnt2++;
            }
        }
        if (cnt2 > arr.length / 2) {
            return el;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 3, 1, 2, 2 };
        Solution_20 s = new Solution_20();
        System.out.println(s.mejorityElementHashmap(arr));
        System.out.println("optimal solution");
        System.out.println(s.majorityElementOptimal(arr));
    }
}
