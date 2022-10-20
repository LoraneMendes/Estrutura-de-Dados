import java.util.Arrays;

public class ShellSort {

    public static int[] shellSorDesc;
    public static int[] quaseOrdSS;

    public static int[] sort(int[] numerosPrincipal) {
        int n = numerosPrincipal.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < n; i += 1) {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = numerosPrincipal[i];

                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && numerosPrincipal[j - gap] > temp; j -= gap)
                    numerosPrincipal[j] = numerosPrincipal[j - gap];

                // put temp (the original a[i]) in its correct
                // location
                numerosPrincipal[j] = temp;
            }
        }
        return numerosPrincipal;
    }

    public static void shellSorDesc(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ",  ");
        }
    }

    public static int[] quaseOrdSS(int[] arr) {
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
