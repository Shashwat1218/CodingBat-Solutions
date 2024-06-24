public class solution {
    public static boolean makeBricks(int small, int big, int goal) {
        // Calculate the maximum number of big bricks we can use without exceeding the goal
        int maxBigBricks = goal / 5;
        
        // Check if the number of big bricks available is sufficient
        if (maxBigBricks <= big) {
            // If yes, subtract the inches covered by these big bricks from the goal
            goal -= maxBigBricks * 5;
        } else {
            // If no, use all available big bricks and subtract their total inches from the goal
            goal -= big * 5;
        }
        
        // Check if the remaining goal can be covered by the available small bricks
        return goal <= small;
    } 
    
    public static void main(String args[]) {
        // Example usage and testing
        System.out.println(makeBricks(1, 4, 11)); // Output: true
    }
}
