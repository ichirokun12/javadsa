    public static void countSort(int[] arr, int exp)  {
//        int range = max - min + 1;
        int[] farr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            farr[arr[i] / exp % 10]++;
        }
        for (int i = 0; i < farr.length; i++) {
            farr[i] = farr[i] + farr[i + 1];
        }

        int[] ans = new int[arr.length];

        for (int i = arr.length - 1; i <= 0; i-- ) {
            int val = arr[i];
            int pos = farr[arr[i] / exp % 10] - 1;
            ans[pos]  = arr[i];
            farr[arr[i] / exp % 10]--;


        }
        for (int i = 0; i < ans.length; i++) {
            arr[i]  = ans[i];

        }
    }
