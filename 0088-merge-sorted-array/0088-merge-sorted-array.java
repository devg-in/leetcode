class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int[] arr3 = new int[m + n];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }

        while (i < m) {
            arr3[k++] = arr1[i++];
        }

        while (j < n) {
            arr3[k++] = arr2[j++];
        }

        for (int x = 0; x < m + n; x++) {
            arr1[x] = arr3[x];
        }
    }
}