// Louis | Completed in 38:35

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // The goal of this exercise is to find the longest common prefix string that matches among the strings.

        // This can be done by checking each character of each string from left to right and comparing them one
        // at a time. If the first character is the same across, move to the next one, etc until a different
        // character is found. A new created string hold each matching letter by appending it as the
        // letters are compared. Once a non matching letter is found, the string can be returned as the answer.

        // An out of bounds error may occur if a string is compared that is too short. We can void this by
        // first crawling the array to find the shortest string and never searching the strings beyond that size.

        // The actual search can be done using a inner and outer for loop. The outer for loop will keep track of
        // which character index in the strings is being compared and the inner for loop will crawl the array
        // comparing the outside loops character index to each string in the array. A boolean value can be used
        // to determine if the characters matched or not.


        // Start Pseudocode
        /*
            Initialize new string ans to hold the answer
            String ans = "";

            Initialize integer to hold longest string in the given array
            int longestString = 0;

            Initializie boolean matching check
            boolean match;

            for loop to loop through the given string array to find the longest string in the given array
                if longestString variable is less than the current string array index location string length
                    longest string = the current string array index location string length

            For loop to compare each letter of the strings up to the longest string

                for loop to loop through each string in the array
                    if the current character matches the outside searching character
                        boolean match is true and the comparison continues
                    if it does not match
                        boolean match becomes false and the inner for loop breaks out to the outer loop

            if the match boolean is true from the previous check
                the letter is appended to the ans string and the loop continues
            if it isn't
                return the ans string 
        */
        // End Pseudocode

        // Code Start
        // Initializing needed variables
        String ans = "";
        int longestString = strs[0].length();
        char currentChar;
        boolean match = true;

        // For loop to find the longest string in the given array and store the longest string length as an integer
        for (int i = 0; i < strs.length; i++){
            if (longestString > strs[i].length()){
                longestString = strs[i].length();
            }
        }
    
        // Outside for loop to track which string character is being compared. oI stands for outside Index.
        for (int oI = 0; oI < longestString; oI++){
            
            currentChar = strs[0].charAt(oI);
            // Inside for loop to loop through the given arrays strings comparing the current outside loop index
            // location. iI stands for inside Index.
            for (int iI = 0; iI < strs.length; iI++){
                // If they match, continue the search.
                if (currentChar == strs[iI].charAt(oI)){
                    match = true;
                }
                // If they don't match, return ans
                if (currentChar != strs[iI].charAt(oI)){
                    match = false;
                    return ans;
                }
            }

        // If match is true, append the current character to the ans string and continue the search
        if (match == true){
            ans = ans + currentChar;
        }

        }
    // If match is never false, return a full string of the shortest word as that is longest common prefix
    return ans;
    }
}