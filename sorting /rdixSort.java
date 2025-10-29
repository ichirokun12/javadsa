    public static void radixSort(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }

        int exp = 1;
        while (exp <= max) {
            countSort(arr, exp);
            exp = exp * 10;

        }
    }
