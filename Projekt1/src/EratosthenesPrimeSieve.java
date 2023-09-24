import java.util.ArrayList;
import java.util.List;

public class EratosthenesPrimeSieve  implements PrimeSieve{

    private int bound;
    private List<Boolean> primes;
    private List<Integer> numbs;

    public EratosthenesPrimeSieve(int ij)
    {
       bound = ij;
        primes = new ArrayList<>();
        numbs = new ArrayList<>();
        for (int i = 0; i < bound; i++) {

            numbs.add(i);
            primes.add(true);

        }

    }
    @Override
    public boolean isPrime(int p) {
        int counter = 2;

        for (int i = 2; i < bound; i++) {

            if(primes.get(counter))
            {
                for (int j = counter; j < bound; j*=2) {
                    if(j==counter){

                    }
                    else if(j<=bound)
                    {
                        primes.set(j,false);

                    }

                }


            }

            counter++;
        }





        return false;
    }

    @Override
    public void printPrimes() {

        for (int i = 2; i < bound; i++)
        {
            if(primes.get(i))
            {
                System.out.println(i);
            }
        }

    }
}
