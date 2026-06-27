class Solution {
    public int maximumLength(int[] nums) {
        Map<Long, Integer> frequencyMap = new HashMap<>();

        for (int number : nums) {
            frequencyMap.put((long) number,
                    frequencyMap.getOrDefault((long) number, 0) + 1);
        }

        int maximumSubsetLength = 1;

        // Handle value 1 separately
        if (frequencyMap.containsKey(1L)) {
            int oneCount = frequencyMap.get(1L);
            maximumSubsetLength = Math.max(
                    maximumSubsetLength,
                    (oneCount % 2 == 0) ? oneCount - 1 : oneCount
            );
        }

        for (long startingNumber : frequencyMap.keySet()) {
            if (startingNumber == 1L) {
                continue;
            }

            long currentNumber = startingNumber;
            int currentSubsetLength = 0;

            while (frequencyMap.getOrDefault(currentNumber, 0) >= 2) {
                currentSubsetLength += 2;

                if (currentNumber > 1_000_000_000L) {
                    break;
                }

                currentNumber *= currentNumber;
            }

            if (frequencyMap.getOrDefault(currentNumber, 0) >= 1) {
                currentSubsetLength++;
            } else {
                currentSubsetLength--;
            }

            maximumSubsetLength = Math.max(maximumSubsetLength, currentSubsetLength);
        }

        return maximumSubsetLength;
    }
}