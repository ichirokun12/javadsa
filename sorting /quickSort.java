    public static int partitioningOfAnArray(int[] arr, int pivot, int low, int high) {

        int i = low;
        int j = low;

        while (i < high) {
            if(arr[i] > pivot) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = arr[i];
                i++;
                j++;
            }
        }
        return (j - 1);
    }

   public static void quickSort(int[] arr, int low, int high) {
        int pivot = arr[high];

        int pi = partitioningOfAnArray(arr, pivot, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);

    }
