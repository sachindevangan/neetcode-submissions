class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Create a hashmap to count the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Populate the frequency map
        for (int i = 0; i < nums.length; i++) {
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0) + 1);
        }

        // Create an array of lists (buckets) to group numbers by their frequency
        List<Integer>[] buckets = new List[nums.length + 1];
        
        // Initialize each bucket as an ArrayList
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Populate the buckets with numbers based on their frequency
        for (int num : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(num);
            buckets[frequency].add(num); // Add the number to its frequency bucket
        }

        // Extract the top k frequent elements from the buckets
        int[] result = new int[k];
        int index = 0;

        // Start from the bucket with the highest frequency and go downwards
        for (int i = buckets.length - 1; i >= 0; i--) {
            if (!buckets[i].isEmpty()) { // Ensure the bucket is not empty
                for (int j = 0; j < buckets[i].size(); j++) {
                    result[index++] = buckets[i].get(j);
                    if (index == k) { // Stop when we have enough elements
                        return result; // Return the result array
                    }
                }
            }
        }

        return result; // Return the result array
    }
}
