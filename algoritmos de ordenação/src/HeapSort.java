import java.util.Arrays;

public class HeapSort extends Tempo {
    public static int[] quaseOrdHS;
    public static int[] heapSorDesc;

    public void sort(int[] arr) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int[] arr, int n, int i) {
        int maiorValor = i;  // Initialize largest as root
        int valEsq = 2 * i + 1;  // left = 2*i + 1
        int valDir = 2 * i + 2;  // right = 2*i + 2

        // If left child is larger than root
        if (valEsq < n && arr[valEsq] > arr[maiorValor])
            maiorValor = valEsq;

        // If right child is larger than largest so far
        if (valDir < n && arr[valDir] > arr[maiorValor])
            maiorValor = valDir;

        // If largest is not root
        if (maiorValor != i) {
            int swap = arr[i];
            arr[i] = arr[maiorValor];
            arr[maiorValor] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, maiorValor);
        }
    }

    /* A utility function to print array of size n */
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + ", ");
        System.out.println();
    }

    public static void heapSorDesc(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ",  ");
        }
    }

    public static int[] quaseOrdHS(int[] arr) {
        int posicaoOriginal = arr.length;
        int novaPosicao = (int) (arr.length * 0.05);
        int[] novaArr = arr;
        int temp = novaArr[posicaoOriginal - 1];
        novaArr[posicaoOriginal - 1] = novaArr[novaPosicao];
        novaArr[novaPosicao] = temp;
        System.out.println(Arrays.toString(novaArr));
        return novaArr;
    }
}