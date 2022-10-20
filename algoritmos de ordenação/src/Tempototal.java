import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;

public class Tempototal {
    public static int tempo2(Object[][] qualquerArray) {
        Instant instantStarted = Instant.now();
        Fibonacci2(40);
        Instant instantStopped = Instant.now();
        Duration durationBetween = Duration.between(instantStarted, instantStopped);
//                System.out.println("Execução em millisegundos: " + durationBetween.toMillis());
//                System.out.println("Execução em segundos: " + durationBetween.toSeconds());
        return (int) durationBetween.toSeconds();

    }

    private static BigInteger Fibonacci2(int n) {
        if (n < 2)
            return BigInteger.ONE;
        else
            return Fibonacci2(n - 1).add(Fibonacci2(n - 2));
    }
}
