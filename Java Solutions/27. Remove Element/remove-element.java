// Louis | Completed in 51:54

class Solution {
    public int removeElement(int[] nums, int val) {
        // The goal of this exercise is to return the variable k and resort the given array in a specific way. 

        // The value k is to be the number of elements in the array that are not equal to the given variable val.

        // The array is to be resorted to where the elements starting from 0 to k are from the array but not
        // equal to the given variable val. They can be in any order.

        // The first goal is to find the number of elements not equal to val and store that value in k. 

        // The next goal is to replace the values equal to val below or equal to k with elements not equal to value beyond
        // index k. Once k is reached, the array should be correctly set up.

        // A while loop starting from the begining of the array until k will be used to find a value that is equal to val
        // Once that value is found, a inside for loop starting from the end of the array will find a value that is not equal 
        // to val and replace the the outside while loops index value with it. It will then set the inside index loops 
        // value to val so the value is not used again. 

        // The process will repeat until the outside loop has reached k and does not have to loop anymore.

        // Pseudocode plan start
        /*
            initialize needed variable k


            loop through array to find k
                if (nums[index] != val)
                    k++;

            while loop through array to replace val values with values beyond index k
                if (nums[index] == val)
                    for loop starting at the end of the array
                        if (nums[insideIndex] != val)
                            nums[index] = nums[insideIndex]
                            nums[insideIndex] = val
                            break

        return k
        */
        // End Pseudocode plan

        // Initializing needed k variable
        int k = 0;

        // For loop to find number of values != k
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != val)
                k++;
        }

        // Initializing insde and outside index trackers
        // insideIndex is equal to nums.length as that loop starts at the end of the array.
        int outsideIndex = 0;

        // While loop to loop through nums until index goes past k. Loop replaces val values before k with values after k
        while (outsideIndex != k){
            // Checks if the current index value is equal to val
            if (nums[outsideIndex] == val){
                // While loop to start at the end of the array and find first value not equal to val
                // Breaks from loop once it finds the value
                for (int i = nums.length - 1; i != 0; i--){
                    if (nums[i] != val){
                        nums[outsideIndex] = nums[i];
                        nums[i] = val;
                        break;
                    }
                }
            }
            outsideIndex++;
        }
        return k;
    }
}