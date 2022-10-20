import java.io.*;
import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.gc();
        System.runFinalization();



        System.out.println("Defina o tamanho da array: ");
        Scanner scanTamanho = new Scanner(System.in);
        int tamanho = scanTamanho.nextInt();
        int[] numeros = new int[tamanho];
        System.out.println(String.join(" " + Arrays.toString(numeros)));
        Random rand = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.abs(rand.nextInt());
        }

        //declaracão das copias aqui
        int[] arrQuickSortCopia = Arrays.copyOf(numeros, tamanho);
        int[] arrShellSCopia = Arrays.copyOf(numeros, tamanho);
        int[] arrHeapSortCopia = Arrays.copyOf(numeros, tamanho);
        int[] arrSelectionSCopia = Arrays.copyOf(numeros, tamanho);
        int[] arrInsertionSCopia = Arrays.copyOf(numeros, tamanho);
        int[] arrMergeSCopia = Arrays.copyOf(numeros, tamanho);

        int n = numeros.length;
        System.out.println("1) QUICK SORT");
        System.out.print("Array antes do Quicksort: ");
        System.out.println(Arrays.toString(numeros));
        QuickSort.quickSort(numeros, 0, n - 1);
        System.out.print("Array após o quicksort: ");
        int[] tempQS = QuickSort.quickSort(arrQuickSortCopia,0,n-1);
        System.out.println(Arrays.toString(tempQS));
        System.out.print("Array após o quicksort invertido: ");
        QuickSort.quickSorDesc(tempQS);
        System.out.print("\nArray após o quicksort Quase Ordenado: ");
        System.out.println(Arrays.toString(QuickSort.quaseOrdQS(tempQS)));

        System.out.println("\n=============== 2) SHELLSORT ==================");
        System.out.print("Array antes do Shellsort: ");
        System.out.println(Arrays.toString(arrShellSCopia));
        System.out.print("Array após o Shellsort: ");
        int[] tempSSort = ShellSort.sort(arrShellSCopia);
        System.out.println(Arrays.toString(tempSSort));
        System.out.print("Array após o Shellsort invertido: ");
        ShellSort.shellSorDesc(tempSSort);
        System.out.print("\nArray após o Shellsort quase ordenado: ");
        System.out.println(Arrays.toString(ShellSort.quaseOrdSS(tempSSort)));


        System.out.println("\n=============== 3) HEAPSORT ==================");
        System.out.println("é quase uma arvore binaria ordenada, tem mais pais do que filhos");
        System.out.print("Array antes do Heapsort: ");
        System.out.println(Arrays.toString(arrHeapSortCopia));
        HeapSort objetoHS = new HeapSort();
        objetoHS.sort(arrHeapSortCopia);
        System.out.print("Array após o Heapsort: ");
        HeapSort.printArray(arrHeapSortCopia);
        System.out.print("Array após o Shellsort invertido: ");
        HeapSort.heapSorDesc(arrHeapSortCopia);
        System.out.print("\nArray após o Shellsort quase ordenado: ");
        System.out.println(Arrays.toString(HeapSort.quaseOrdHS(arrHeapSortCopia)));


        System.out.println("\n=============== 4) MERGESORT ==================");
        System.out.print("Array antes do Mergesort: ");
        System.out.println(Arrays.toString(arrMergeSCopia));
        MergeSort objetoMS = new MergeSort();
        objetoMS.sort(arrMergeSCopia, 0, arrMergeSCopia.length - 1);
        System.out.print("Array após o Mergesort: ");
        MergeSort.printArray(arrMergeSCopia);
        System.out.print("Array após o Mergesort invertido: ");
        MergeSort.mergeSorDesc(arrMergeSCopia);
        System.out.print("\nArray após o Mergesort quase ordenado: ");
        System.out.println(Arrays.toString(MergeSort.quaseOrdMS(arrMergeSCopia)));


        System.out.println("\n=============== 5) SELECTIONSORT ==================");
        System.out.print("Array antes do Selectionsort: ");
        System.out.println(Arrays.toString(arrSelectionSCopia));
        SelectionSort objSelc = new SelectionSort();
        objSelc.sort(arrSelectionSCopia);
        System.out.print("Array após o Selectionsort: ");
        objSelc.printArray(arrSelectionSCopia);
        System.out.print("Array após o Selectionsort invertido: ");
        SelectionSort.selcSSorDesc(arrSelectionSCopia);
        System.out.print("\nArray após o Selectionsort quase ordenado: ");
        System.out.println(Arrays.toString(SelectionSort.quaseOrdSelcS(arrSelectionSCopia)));


        System.out.println("\n=============== 6) INSERTIONSORT ==================");
        System.out.print("Array antes do InsertionSort: ");
        System.out.println(Arrays.toString(arrInsertionSCopia));
        InsertionSort objins = new InsertionSort();
        objins.sort(arrInsertionSCopia);
        System.out.print("Array após o InsertionSort: ");
        System.out.println((Arrays.toString(arrInsertionSCopia)));
        System.out.print("Array após o InsertionSort invertido: ");
        InsertionSort.insereDecrescenteInsSort(arrInsertionSCopia);
        System.out.print("\nArray após o InsertionSort quase ordenado: ");
        System.out.println(Arrays.toString(InsertionSort.quaseOrdInserS(arrInsertionSCopia)));


        System.out.println("\n================== RELATÓRIO =====================");//em proximo foi "create field in classe
        System.out.println("Processando, aguarde....");
        Object[][] table = new String[7][];
        System.out.println("Tamanho do conjunto:" + tamanho);
        System.out.println("Tempos obtidos pelos algoritmos");


        table[0] = new String[]{"Algoritmo", " Quase ordenado",                              " Desordenado",                                     " Ordem Decrescente"};
        table[1] = new String[]{"Quicksort", "        "+Tempo.tempo(QuickSort.quaseOrdQS)+"ms", "          "+Tempo.tempo(arrQuickSortCopia)+"ms", "           "+Tempo.tempo(QuickSort.quickSorDesc)+"ms"};
        table[2] = new String[]{"Shellsort", "        "+Tempo.tempo(ShellSort.quaseOrdSS)+"ms", "          "+Tempo.tempo(arrShellSCopia)+"ms", "           "+Tempo.tempo(ShellSort.shellSorDesc)+"ms"};
        table[3] = new String[]{"Heapsort", "        "+Tempo.tempo(HeapSort.quaseOrdHS)+"ms", "          "+Tempo.tempo(arrHeapSortCopia)+"ms", "           "+Tempo.tempo(QuickSort.quickSorDesc)+"ms"};
        table[4] = new String[]{"Mergesort", "        "+Tempo.tempo(MergeSort.quaseOrdMS)+"ms", "          "+Tempo.tempo(arrMergeSCopia)+"ms", "           "+Tempo.tempo(QuickSort.quickSorDesc)+"ms"};
        table[5] = new String[]{"Selectionsort", "        "+Tempo.tempo(SelectionSort.quaseOrdSelcS)+"ms", "          "+Tempo.tempo(arrSelectionSCopia)+"ms", "           "+Tempo.tempo(QuickSort.quickSorDesc)+"ms"};
        table[6] = new String[]{"InsertionSort", "        "+Tempo.tempo(InsertionSort.quaseOrdInserS)+"ms", "          "+Tempo.tempo(arrInsertionSCopia)+"ms", "           "+Tempo.tempo(QuickSort.quickSorDesc)+"ms"};

        for (final Object[] row : table) {
            System.out.format("|%15s|%15s|%15s|%15s%n", row);
        }


        BufferedWriter writter1 = new BufferedWriter(new FileWriter("50000.txt"));
        BufferedWriter writter2 = new BufferedWriter(new FileWriter("100000.txt"));
        BufferedWriter writter3 = new BufferedWriter(new FileWriter("500000.txt"));
        BufferedWriter writter4 = new BufferedWriter(new FileWriter("1000000.txt"));
        //System.out.println("Tempo de execução da tabela: "+Tempototal.tempo2(table)+'"');

//        writter.write(Arrays.toString(table[0]));
        writter1.write(Arrays.toString(table[1]));
        writter1.write(Arrays.toString(table[2]));
        writter1.write(Arrays.toString(table[3]));
        writter1.write(Arrays.toString(table[4]));
        writter1.write(Arrays.toString(table[5]));
        writter1.write(Arrays.toString(table[6]));
        writter1.close();

        writter2.write(Arrays.toString(table[1]));
        writter2.write(Arrays.toString(table[2]));
        writter2.write(Arrays.toString(table[3]));
        writter2.write(Arrays.toString(table[4]));
        writter2.write(Arrays.toString(table[5]));
        writter2.write(Arrays.toString(table[6]));
        writter2.close();

        writter3.write(Arrays.toString(table[1]));
        writter3.write(Arrays.toString(table[2]));
        writter3.write(Arrays.toString(table[3]));
        writter3.write(Arrays.toString(table[4]));
        writter3.write(Arrays.toString(table[5]));
        writter3.write(Arrays.toString(table[6]));
        writter3.close();

        writter4.write(Arrays.toString(table[1]));
        writter4.write(Arrays.toString(table[2]));
        writter4.write(Arrays.toString(table[3]));
        writter4.write(Arrays.toString(table[4]));
        writter4.write(Arrays.toString(table[5]));
        writter4.write(Arrays.toString(table[6]));
        writter4.close();



    }
}
