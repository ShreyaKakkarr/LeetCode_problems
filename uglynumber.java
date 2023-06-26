class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false; // Ugly numbers are positive integers
        }
        
        if (n == 1) {
            return true; // 1 is considered an ugly number
        }
        
        while (n % 2 == 0) {
            n /= 2; // Divide by 2 until n is no longer divisible by 2
        }
        
        while (n % 3 == 0) {
            n /= 3; // Divide by 3 until n is no longer divisible by 3
        }
        
        while (n % 5 == 0) {
            n /= 5; // Divide by 5 until n is no longer divisible by 5
        }
        
        return n == 1; // If n becomes 1, it's an ugly number; otherwise, it's not
    }
}
