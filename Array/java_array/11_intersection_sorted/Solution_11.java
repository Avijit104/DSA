import java.util.ArrayList;

public class Solution_11 {
    public ArrayList<Integer> intersectionSortedVisitedf(int[] arr1, int[] arr2) {
        int[] visited = new int[arr2.length];
        ArrayList<Integer> interArray = new ArrayList<>();
        for (int i = 1; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && visited[j] == 0) {
                    interArray.add(arr1[i]);
                    visited[j] = 1;
                    break;
                }
                if (arr1[i] < arr2[j]) {
                    break;
                }
            }
        }
        return interArray;
    }

    // Optimal Solution
    public ArrayList<Integer> intersectionSortedOptiomal(int[] arr1, int[] arr2) {
        ArrayList<Integer> interArray = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                interArray.add(arr1[i]);
                i++;
                j++;
            }
        }
        return interArray;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2, 3, 3, 4, 5, 6 };
        int arr2[] = { 2, 3, 3, 5, 6, 7 };
        Solution_11 s = new Solution_11();
        ArrayList<Integer> res = s.intersectionSortedVisitedf(arr1, arr2);
        for (Integer i : res) {
            System.out.println(i);
        }
        System.out.println("optimal solution");
        res = s.intersectionSortedOptiomal(arr1, arr2);
        for (Integer i : res) {
            System.out.println(i);
        }
    }
}
