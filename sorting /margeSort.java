    public int[] marge(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;

        int[] ans = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if(arr1[i] <= arr2[j]) {
                ans[k] = arr1[i];
                i++;
                k++;
            } else {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < arr1.length) {
            ans[k] = arr1[i];
        }
        while (j < arr2.length) {
            ans[k] = arr2[j];
        }
        return ans;
    }

    public int[] margeSort(int[] arr, int low, int high) {
        int mid = (low + high) / 2;
        int[] firstSortedHalf = margeSort(arr, low, mid);
        int[] secondSortedArray = margeSort(arr, mid + 1, high);
        return marge(firstSortedHalf, secondSortedArray);
    }
