package net.htlgrk.WintersteigerJ190225.Interface_and_Lambda;

import java.util.ArrayList;

public class EratosthenesPrimeSieve implements PrimeSieve{

    @Override
    public boolean isPrime(int p) {
        ArrayList<Boolean> numbers = new ArrayList<>();
        numbers.forEach(n -> n = true);

        for(int n = 2; p*p <=p; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(numbers.get(n) == true)
            {
                // Update all multiples of p
                for(int i = n*n; i <= p; i += p)
                    numbers.set(i, false);
            }
        }

        return numbers.get(p);
    }

    @Override
    public void printPrimes() {

    }
}
