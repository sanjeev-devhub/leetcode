class Solution {
    private static final long MOD = 1_000_000_007L;

    public int zigZagArrays(int n, int l, int r) {
        int valueCount = r - l + 1;

        if (n == 1) {
            return valueCount;
        }

        int stateCount = 2 * valueCount;

        long[] lengthTwoDp = new long[stateCount];

        for (int currentValue = 0; currentValue < valueCount; currentValue++) {
            lengthTwoDp[currentValue] = currentValue;
            lengthTwoDp[valueCount + currentValue] = valueCount - 1 - currentValue;
        }

        if (n == 2) {
            long totalWays = 0;

            for (long ways : lengthTwoDp) {
                totalWays = (totalWays + ways) % MOD;
            }

            return (int) totalWays;
        }

        long[][] zigZagTransition = new long[stateCount][stateCount];

        for (int currentValue = 0; currentValue < valueCount; currentValue++) {

            // last move UP -> next value must be smaller
            for (int nextValue = 0; nextValue < currentValue; nextValue++) {
                zigZagTransition[valueCount + nextValue][currentValue] = 1;
            }

            // last move DOWN -> next value must be larger
            for (int nextValue = currentValue + 1; nextValue < valueCount; nextValue++) {
                zigZagTransition[nextValue][valueCount + currentValue] = 1;
            }
        }

        long[][] transitionPower = matrixPower(zigZagTransition, n - 2);

        long[] finalStateCounts = multiplyMatrixVector(
                transitionPower,
                lengthTwoDp
        );

        long totalWays = 0;

        for (long ways : finalStateCounts) {
            totalWays = (totalWays + ways) % MOD;
        }

        return (int) totalWays;
    }

    private long[][] matrixPower(long[][] transitionMatrix, long exponent) {
        int stateCount = transitionMatrix.length;

        long[][] resultMatrix = new long[stateCount][stateCount];

        for (int state = 0; state < stateCount; state++) {
            resultMatrix[state][state] = 1;
        }

        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                resultMatrix = multiplyMatrices(resultMatrix, transitionMatrix);
            }

            transitionMatrix = multiplyMatrices(
                    transitionMatrix,
                    transitionMatrix
            );

            exponent >>= 1;
        }

        return resultMatrix;
    }

    private long[][] multiplyMatrices(long[][] leftMatrix, long[][] rightMatrix) {
        int stateCount = leftMatrix.length;

        long[][] productMatrix = new long[stateCount][stateCount];

        for (int fromState = 0; fromState < stateCount; fromState++) {
            for (int middleState = 0; middleState < stateCount; middleState++) {

                if (leftMatrix[fromState][middleState] == 0) {
                    continue;
                }

                long ways = leftMatrix[fromState][middleState];

                for (int toState = 0; toState < stateCount; toState++) {

                    if (rightMatrix[middleState][toState] == 0) {
                        continue;
                    }

                    productMatrix[fromState][toState] =
                            (productMatrix[fromState][toState]
                                    + ways * rightMatrix[middleState][toState]) % MOD;
                }
            }
        }

        return productMatrix;
    }

    private long[] multiplyMatrixVector(long[][] matrix, long[] stateVector) {
        int stateCount = matrix.length;

        long[] resultVector = new long[stateCount];

        for (int targetState = 0; targetState < stateCount; targetState++) {

            long ways = 0;

            for (int sourceState = 0; sourceState < stateCount; sourceState++) {

                if (matrix[targetState][sourceState] == 0
                        || stateVector[sourceState] == 0) {
                    continue;
                }

                ways = (ways
                        + matrix[targetState][sourceState]
                        * stateVector[sourceState]) % MOD;
            }

            resultVector[targetState] = ways;
        }

        return resultVector;
    }
}