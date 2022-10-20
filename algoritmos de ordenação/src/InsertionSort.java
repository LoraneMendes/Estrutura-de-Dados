//https://www.geeksforgeeks.org/insertion-sort/?ref=gcse
import java.util.Arrays;

public class InsertionSort {
    public static int[] quaseOrdInserS;
    public static int[] inserSSorDesc;

    /*Function to sort array using insertion sort*/
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int index = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > index) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = index;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void insereDecrescenteInsSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ",  ");
        }
    }

    public static int[] quaseOrdInserS(int[] arr) {
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