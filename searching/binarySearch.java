class Searching {
    public int binarySearch(int[] nums, int key) {
        int low = 0;
        int high = nums.length -1;
        int mid = low + (high - low) / 2;
        while (low <= high) {
            if(mid == key) {
                return key;
            }
            if (low < key) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
