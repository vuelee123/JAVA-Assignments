package DAY62;

class BubbleSort {
    static void bubbleSort(int arr[])
    {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubbleSort(arr);
        System.out.println("Bubble Sort: ");
        printArray(arr);
    }
}
