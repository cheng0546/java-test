import java.util.Arrays;

public class SortAlgo {

    public static int[] bubbleSort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int min = Integer.MAX_VALUE;
            int index = 0;
            for (int j = i; j < len; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = min;
        }
        return arr;
    }

    public static int[] insertionSort(int[] sourceArray) {
        int len = sourceArray.length;
        int[] arr = new int[len];
        arr[0] = sourceArray[0];
        for (int i = 1; i < len; i++) {
            int num = sourceArray[i];
            for (int j = i - 1; j >= 0; j--) {
                if (num < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    arr[j + 1] = num;
                    break;
                }
            }
        }
        return arr;
    }

    public static int[] shellSort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        int len = arr.length;
        for (int d = len / 2; d >= 1; d /= 2) {
            for (int i = d; i < len; i++) {
                for (int j = i - d; j >= 0; j -= d) {
                    int num = arr[j];
                    if (arr[j + d] <= num) {
                        arr[j] = arr[j + d];
                        arr[j + d] = num;
                    }
                }
            }
        }
        return arr;
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start > end) {
            return;
        }
        int k = arr[start];
        int left = start, right = end;
        while (left != right) {
            while (arr[right] >= k && left < right) {
                right--;
            }
            while (arr[left] <= k && left < right) {
                left++;
            }
            if (left < right) {
                int num = arr[left];
                arr[left] = arr[right];
                arr[right] = num;
            }
        }
        arr[start] = arr[left];
        arr[left] = k;
        quickSort(arr, start, right - 1);
        quickSort(arr, right + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = {1, 342, 25, 6, 8, 13, 52, 32, 12, 55, 178};
        System.out.println(Arrays.toString(arr));
        System.out.println("------------------");
        System.out.println("Bubble sort : " + Arrays.toString(bubbleSort(arr)));
        System.out.println("Selection sort : " + Arrays.toString(selectionSort(arr)));
        System.out.println("Insertion sort : " + Arrays.toString(insertionSort(arr)));
        System.out.println("Shell sort : " + Arrays.toString(shellSort(arr)));
        int[] arrQuickSort = Arrays.copyOf(arr, arr.length);
        quickSort(arrQuickSort, 0, arrQuickSort.length - 1);
        System.out.println("Quick sort : " + Arrays.toString(arrQuickSort));
    }
}
