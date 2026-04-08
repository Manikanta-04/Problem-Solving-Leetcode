public class Solution {
    public void printNos(int n) {
        // Code here
        if (n <= 0) return;

        // Recursive call with a smaller number
        printNos(n - 1);

        // Print after the recursive call (backtracking)
        System.out.print(n + " ");
    }
}
 {
    
}
