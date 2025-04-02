class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Initializing sum variable for checking sums
        int sum = 0;

        // Initializing return array to hold both locations
        int[] locations = { 0, 0 };

        // for loop to loop through first index location. This will increase to the second index location to check each index location if the target isn't found. i.e. index1 compared to all indexes after, index2 compared to all indexes after, etc.
        for (int a = 0; a < nums.length; a++) {

            // For loop to sum current loopindex number with second number
            for (int i = a + 1; i < nums.length; i++) {
                // Adding current loopindex number from nums array to for loop index nums array.
                sum = nums[a] + nums[i];

                // Checking to see if the sum of both numbers is equal to the target. If they are, sets locations array to index locations of both numbers from nums array and breaks out of the for loop.
                if (sum == target) {
                    locations[0] = a;
                    locations[1] = i;
                    break;
                }
            }
            // Breaking out of for loop if sum equals the target
            if (sum == target) {
                break;
            }
        }
        return locations;
    }
}