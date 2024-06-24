public class solution {
    public static int blackjack(int a, int b) {
        // Check if both values exceed 21
        if (a > 21 && b > 21) {
            return 0;
        }
        
        // Check if value 'a' exceeds 21
        if (a > 21) {
            return b;
        }
        
        // Check if value 'b' exceeds 21
        if (b > 21) {
            return a;
        }
        
        // If neither value exceeds 21, return the value closer to 21
        return a > b ? a : b;
    }
    
    public static void main(String args[]) {
        // Example usage and testing
        System.out.println(blackjack(19, 21)); // Output: 21
    }
}
