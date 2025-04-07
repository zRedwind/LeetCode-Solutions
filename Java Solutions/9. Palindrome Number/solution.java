// Louis | Completed in 20:09

class Solution {
    public boolean isPalindrome(int x) {
        // For this problem, the goal is to return true if the given integer variable x is a palindrome
        // and false if it is not a palindrome.

        // A palindrome is an integer that is the same forwards and backwards. 
        // Ex. 121 is 121 backwards. True.
        // Ex. -121 is 121- backwards. False

        // The easiest way to do this would be to convert it to a string and compare the characters.
        // The characters could then be reversed and compared to int x.

        // Pseudocode start
        /*
            Initialize new String y holding the value of int x
            String y = x + "";

            Initialize new String z to hold reversed value
            String z;

            For loop to loop starting from end of y string going to start of y string {
                Add character to z string;
            }

            Compare string y to z. If they are equal, return true as x is a palindrome
            if (y == z)
                return true
            else
                return false
        */
        // End Pseudocode

        // Initializing y string to hold x value and z string for future use
        String y = x + "";
        String z = "";
        
        // For loop looping through y backwards. Each loop will add a character to string z.
        for (int i = y.length(); i > 0; i--){
            // Adds the current character at i index of y string to the end of z string.
            z = z + y.charAt(i - 1);
        }

        // Returns true if y equals z and false if it does not.
        return y.equals(z);
    }
}