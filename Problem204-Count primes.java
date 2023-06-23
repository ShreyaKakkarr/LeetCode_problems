class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        // Initialize all numbers as prime
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Apply Sieve of Eratosthenes
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Count the prime numbers
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}
