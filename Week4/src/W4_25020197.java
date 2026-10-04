import java.util.*;

public class W4_25020197 {
    public static void bubbleSort(int[] a, int n) {
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }

    public static int find_h(int[] a, int n) {
        for(int i = n; i >= 1; i--) {
            int h = i;
            if(a[n - h + 1] >= h) {
                return h;
            }
        }
        return 0;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];
        for(int i = 1; i <= n; i++) {
            int t = scanner.nextInt();
            arr[i] = t;
        }

        bubbleSort(arr, n);
        System.out.println(find_h(arr, n));

        scanner.close();
    }
}
