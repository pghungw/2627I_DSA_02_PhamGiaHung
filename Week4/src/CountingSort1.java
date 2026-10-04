import java.util.Scanner;

public class CountingSort1 {

    public static int[] countingSort(int[] arr) {
        int[] frequency = new int[100];

        for (int num : arr) {
            frequency[num]++;
        }

        return frequency;
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

        // Gọi hàm đếm
        int[] result = countingSort(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        scanner.close();
    }
}