import java.util.Scanner;

public class CorrectnessInvariant {

    public static void insertionSort(int[] A) {
        int n = A.length;
        for (int i = 1; i < n; i++) {
            int value = A[i];
            int j = i - 1;

            while (j >= 0 && A[j] > value) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }
    }

    public static void printArray(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
            if (i < ar.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        insertionSort(arr);

        printArray(arr);

        scanner.close();
    }
}