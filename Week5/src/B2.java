import java.util.Arrays;
import java.util.Random;

public class B2 {

        // 1. Thuật toán Insertion Sort
        public static void insertionSort(int[] a) {
            int n = a.length;
            for (int i = 1; i < n; i++) {
                int key = a[i];
                int j = i - 1;
                while (j >= 0 && a[j] > key) {
                    a[j + 1] = a[j];
                    j--;
                }
                a[j + 1] = key;
            }
        }

        // 2. Thuật toán MergeSort (Top-down)
        public static void mergeSort(int[] a) {
            int[] aux = new int[a.length];
            mergeSort(a, aux, 0, a.length - 1);
        }

        private static void mergeSort(int[] a, int[] aux, int lo, int hi) {
            if (hi <= lo) return;
            int mid = lo + (hi - lo) / 2;
            mergeSort(a, aux, lo, mid);
            mergeSort(a, aux, mid + 1, hi);
            merge(a, aux, lo, mid, hi);
        }

        private static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
            for (int k = lo; k <= hi; k++) {
                aux[k] = a[k];
            }
            int i = lo, j = mid + 1;
            for (int k = lo; k <= hi; k++) {
                if (i > mid)               a[k] = aux[j++];
                else if (j > hi)           a[k] = aux[i++];
                else if (aux[j] < aux[i]) a[k] = aux[j++];
                else                       a[k] = aux[i++];
            }
        }

        public static void main(String[] args) {
            int[] sizes = {5000, 20000, 50000};
            System.out.printf("%-10s | %-15s | %-15s | %-15s%n",
                    "Size (N)", "Dạng dữ liệu", "Insertion Sort", "MergeSort");
            System.out.println("---------------------------------------------------------------");

            Random rand = new Random(42);
            for (int n : sizes) {
                // Mảng ngẫu nhiên (Random)
                int[] original = new int[n];
                for (int i = 0; i < n; i++) original[i] = rand.nextInt(n * 10);
                runBenchmark(n, "Random", original);

                // Mảng đã sắp xếp (Sorted)
                int[] sorted = original.clone();
                Arrays.sort(sorted);
                runBenchmark(n, "Sorted", sorted);

                // Mảng sắp xếp ngược (Reversed)
                int[] reversed = new int[n];
                for (int i = 0; i < n; i++) reversed[i] = sorted[n - 1 - i];
                runBenchmark(n, "Reversed", reversed);
            }
        }

        private static void runBenchmark(int n, String label, int[] input) {
            long tInsertion = -1;
            // Bỏ qua Insertion sort nếu N lớn trên mảng nghịch đảo để tránh chờ quá lâu
            if (n <= 20000 || label.equals("Sorted")) {
                int[] a = input.clone();
                long start = System.nanoTime();
                insertionSort(a);
                tInsertion = (System.nanoTime() - start) / 1_000_000;
            }

            int[] b = input.clone();
            long start = System.nanoTime();
            mergeSort(b);
            long tMerge = (System.nanoTime() - start) / 1_000_000;

            System.out.printf("%-10d | %-15s | %-15s | %-15s%n",
                    n, label,
                    (tInsertion == -1 ? "> 5000 ms" : tInsertion + " ms"),
                    tMerge + " ms");
        }
}
