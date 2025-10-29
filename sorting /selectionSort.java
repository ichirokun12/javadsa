    public void selectionSort(int[] arr) {
        int indexOfMin;
        for (int i = 0; i < arr.length - 1; i++) {
            indexOfMin = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < indexOfMin) {
                    indexOfMin = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[indexOfMin];
            arr[indexOfMin] = temp;
        }
    }
