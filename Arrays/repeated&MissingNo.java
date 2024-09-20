import java.util.*;

public class repeatedNo {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int n = A.length;
        
        // Expected sum and sum of squares
        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSumSquares = (long) n * (n + 1) * (2 * n + 1) / 6;
        
        // Actual sum and sum of squares from the array
        long actualSum = 0;
        long actualSumSquares = 0;
        
        for (int num : A) {
            actualSum += num;
            actualSumSquares += (long) num * num;
        }
        
        // Differences between expected and actual sums
        long sumDiff = expectedSum - actualSum; // y - x
        long squareSumDiff = expectedSumSquares - actualSumSquares; // y^2 - x^2
        
        // (x + y) = squareSumDiff / sumDiff
        long sumXplusY = squareSumDiff / sumDiff;
        
        // Solving the two equations:
        long missingNumber = (sumDiff + sumXplusY) / 2;
        long repeatedNumber = sumXplusY - missingNumber;
        
        return new int[]{(int) repeatedNumber, (int) missingNumber};
    }
}
