import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;

class Tempo {//nao eh publica

    public static int tempo(int[] qualquerArray) {
        Instant instantStarted = Instant.now();
        Fibonacci(40);
        Instant instantStopped = Instant.now();
        Duration durationBetween = Duration.between(instantStarted, instantStopped);
//                System.out.println("Execução em millisegundos: " + durationBetween.toMillis());
//                System.out.println("Execução em segundos: " + durationBetween.toSeconds());
        return (int) durationBetween.toMillis();

    }

    private static BigInteger Fibonacci(int n) {
        if (n < 2)
            return BigInteger.ONE;
        else
            return Fibonacci(n - 1).add(Fibonacci(n - 2));
    }
}