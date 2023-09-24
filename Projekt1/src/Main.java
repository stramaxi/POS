import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bound?");

        EratosthenesPrimeSieve p = new EratosthenesPrimeSieve(sc.nextInt());
       p.isPrime(69);
        p.printPrimes();

    }
}