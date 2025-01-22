
public class lab_3_second {
//2) Given an array containing N-1 unique numbers from 1 to N, write a Java program to find the missing number.
//Input: [1, 5, 6, 2, 4] 
//Output: 3

    public static void sortArray(int arr[]) {
        boolean swapped;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 2, 4};
        sortArray(arr);
        int missing = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] - arr[i] > 1) {
                missing = arr[i] + 1;
                break;
            }
        }
        if (missing == -1) {
            missing = arr[arr.length - 1] + 1;
        }
        System.out.println("missing numbers are: " + missing);
    }
}
