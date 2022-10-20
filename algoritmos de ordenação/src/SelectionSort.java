import java.util.Arrays;

public class SelectionSort {
    public static int[] quaseOrdSelcS;
    public static int[] selcSSorDesc;

    public void sort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    // Prints the array
    public void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void selcSSorDesc(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ",  ");
        }
    }

    public static int[] quaseOrdSelcS(int[] arr) {
        int posicaoOriginal = arr.length;
        int novaPosicao = (int) (arr.length *0.05);
        int[] novaArr = arr;
        int temp = novaArr[posicaoOriginal - 1];
        novaArr[posicaoOriginal - 1] = novaArr[novaPosicao];
        novaArr[novaPosicao] = temp;
        System.out.println(Arrays.toString(novaArr));
        return novaArr;
    }
}