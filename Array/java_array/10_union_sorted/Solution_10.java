import java.util.*;

public class Solution_10 {
    public int[] unionSrotrdUsingSet(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        int unionArray[] = new int[set.size()];
        int j = 0;
        for (Integer st : set) {
            unionArray[j++] = st;
        }
        return unionArray;
    }

    // Optimal Solution
    public ArrayList<Integer> unionSrotedOptimal(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> unionArray = new ArrayList<Integer>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if ((unionArray.size() == 0) || (unionArray.get(unionArray.size() - 1) != arr1[i])) {
                    unionArray.add(arr1[i]);
                }
                i++;
            } else {
                if ((unionArray.size() == 0) || (unionArray.get(unionArray.size() - 1) != arr2[j])) {
                    unionArray.add(arr2[j]);
                }
                j++;
            }
        }
        while (i < arr1.length) {
            if ((unionArray.size() == 0) || (unionArray.get(unionArray.size() - 1) != arr1[i])) {
                unionArray.add(arr1[i]);
            }
            i++;

        }
        while (j < arr2.length) {

            if ((unionArray.size() == 0) || (unionArray.get(unionArray.size() - 1) != arr2[j])) {
                unionArray.add(arr2[j]);
            }
            j++;
        }
        return unionArray;

    }

    public static void main(String[] args) {
        int arr1[] = { 1, 1, 2, 3, 4, 5 };
        int arr2[] = { 2, 3, 4, 4, 5, 6 };
        Solution_10 s = new Solution_10();
        int res[] = s.unionSrotrdUsingSet(arr1, arr2);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        System.out.println("optimal solution");
        ArrayList<Integer> resOPti = s.unionSrotedOptimal(arr1, arr2);
        for (Integer i : resOPti) {
            System.out.println(i);
        }
    }
}
