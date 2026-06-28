class revBubbleSort {

    public static void main(String[] args) {

        int[] arr = {21, 35, 4, 23, 7, 81, 19};
        int n = arr.length;

        Sort(arr, n);
    }

    public static void Sort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {

                // Descending order
                if (arr[j] < arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swapping occurred, array is already sorted
            if (!swapped) {
                break;
            }
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}