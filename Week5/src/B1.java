import java.util.Scanner;

public class B1 {
        public static int introTutorial(int V, int[] arr) {
            int low = 0;
            int high = arr.length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] == V) {
                    return mid;
                } else if (arr[mid] < V) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int V = scanner.nextInt();
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.println(introTutorial(V, arr));
            scanner.close();
        }
}
