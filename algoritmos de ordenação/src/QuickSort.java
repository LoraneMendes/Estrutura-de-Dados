import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class QuickSort extends Tempo {
    public static int[] quickSorDesc;
    public static int[] quaseOrdQS;

    public static void inversao(int[] arrayNums, int i, int j) {
        int temp = arrayNums[i];
        arrayNums[i] = arrayNums[j];
        arrayNums[j] = temp;
    }

    static int particionar(int[] arr, int menor, int maior) {
        int pivo = arr[maior]; //pivo é o maior
        int i = (menor - 1); //joga o menor para a direita

        for (int valAtual = menor; valAtual <= maior - 1; valAtual++) {
            if (arr[valAtual] < pivo) {
                i++; //incrementa o menor, que antes foi -1 para realizar a movimentacão dos index
                inversao(arr, i, valAtual); //chama a função (recursão) e ubstitui os valores agora trocados
            }
        }

        inversao(arr, i + 1, maior); //incrementa o menor +1 para a troca SE o valor atual não for menor que o maior
        return (i + 1);
    }

    public static int[] quickSort(int[] arr, int menorVal, int maiorVal) {
        if (menorVal < maiorVal) {
            int arrayParticionada = particionar(arr, menorVal, maiorVal);
            // particiona os elementos e ordena a posição deles
            quickSort(arr, menorVal, arrayParticionada - 1);
            quickSort(arr, arrayParticionada + 1, maiorVal);
        }
        return arr;
    }

    public static void quickSorDesc(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ",  ");
        }
    }

    public static int[] quaseOrdQS(int[] arr) {
        int posicaoOriginal = arr.length;
        int novaPosicao = (int) (arr.length * 0.05);
        int[] novaArr = arr;
        int temp = novaArr[posicaoOriginal - 1];
        novaArr[posicaoOriginal - 1] = novaArr[novaPosicao];
        novaArr[novaPosicao] = temp;
        System.out.println(Arrays.toString(novaArr));
        return novaArr;
    }
    public static int tempo(int[] qualquerArray) {
        Instant instantStarted = Instant.now();
        Fibonacci(40);
        Instant instantStopped = Instant.now();
        Duration durationBetween = Duration.between(instantStarted, instantStopped);
//                System.out.println("Execução em millisegundos: " + durationBetween.toMillis());
//                System.out.println("Execução em segundos: " + durationBetween.toSeconds());
        return (int) durationBetween.toSeconds();

    }

    private static BigInteger Fibonacci(int n) {
        if (n < 2)
            return BigInteger.ONE;
        else
            return Fibonacci(n - 1).add(Fibonacci(n - 2));
    }



}