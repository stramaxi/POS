import java.util.ArrayList;
import java.util.List;

public class EratosthenesPrimeSieve  implements PrimeSieve{

    private int bound;
    private List<Boolean> primes;
    private List<Integer> numbs;

    public EratosthenesPrimeSieve()
    {
        primes = new ArrayList<>();
        numbs = new ArrayList<>();
        for (int i = 2; i < bound; i++) {

            numbs.set(i,i);
            primes.set(i,true);

        }

    }
    @Override
    public boolean isPrime(int p) {

        if()





        return false;
    }

    @Override
    public void printPrimes() {

    }
}
