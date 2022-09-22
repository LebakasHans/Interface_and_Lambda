package net.htlgrk.WintersteigerJ190225.Interface_and_Lambda;

import java.util.ArrayList;

public class EratosthenesPrimeSieve implements PrimeSieve{
    boolean[] numbers;

    @Override
    public boolean isPrime(int p) {
        numbers = new boolean[p+1];
        for(int i=0 ; i<=p ; i++) {
            numbers[i] = true;
        }

        for(int n = 2; n*n <=p; n++)
        {
            // If prime[p] is not changed, then it is a prime
            if(numbers[n] == true)
            {
                // Update all multiples of p
                for(int i = n*n; i <= p; i += n)
                    numbers[i] = false;
            }
        }

        return numbers[p];
    }

    @Override
    public void printPrimes() {
        int counter = 0;
        for(boolean b : numbers){
            if (b == true){
                System.out.println(counter);
            }
            counter++;
        }
    }
}
