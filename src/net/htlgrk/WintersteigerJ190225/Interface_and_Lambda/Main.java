package net.htlgrk.WintersteigerJ190225.Interface_and_Lambda;

public class Main {
    public static void main(String args[])
    {
        EratosthenesPrimeSieve eratosthenesPrimeSieve = new EratosthenesPrimeSieve();
        boolean b = eratosthenesPrimeSieve.isPrime(2);
        System.out.println(b);
    }
}
