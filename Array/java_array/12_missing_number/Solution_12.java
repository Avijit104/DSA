
public class Solution_12 {
    public int missingNumber(int[] arr, int n) {
        int cnt = 1;
        while (cnt < n) {
            int flag = 1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == cnt) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                return cnt;
            }
            cnt++;
        }
        return -1;
    }

    public int missingNumberHash(int[] arr, int n) {
        int[] hashArr = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            hashArr[arr[i]] = 1;
        }
        for (int i = 1; i < hashArr.length; i++) {
            if (hashArr[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    // Optimal Solution
    public int missingNumberSum(int[] arr, int n) {
        int sumOri = (int) (n * (n + 1) / 2);
        int sumArr = 0;
        for (int i : arr) {
            sumArr = sumArr + i;
        }
        return (sumOri - sumArr);
    }

    // Optimal Solution but slightly better in space than sum method
    public int missingNumberXOR(int[] arr, int n) {
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < arr.length; i++) {
            xor1 = xor1 ^ arr[i];
            xor2 = xor2 ^ (i + 1);
        }
        xor2 = xor2 ^ n;
        return (xor1 ^ xor2);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        int n = 5;
        Solution_12 s = new Solution_12();
        System.out.println(s.missingNumber(arr, n));
        System.out.println(s.missingNumberHash(arr, n));
        System.out.println(s.missingNumberSum(arr, n));
        System.out.println(s.missingNumberXOR(arr, n));
    }
}
