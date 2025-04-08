// Louis | Completed in 36:18

class Solution {
    public int romanToInt(String s) {
        // The goal of this exercise is to convert a given string representing a Roman numeral into a integer
        // holding the value of that roman numeral.
        // An example would be the given string as "III" is returns as an integer with the value of 3

        // The different symbols are I, V, X, L, C, D, and M. Their values are as follows:
        /*
            I = 1
            V = 5
            X = 10
            L = 50
            C = 100
            D = 500
            M = 1000
        */
        // In most cases, the values can be read straight across from left to right.
        // The exceptions are as follows:
        /*
            IV = 4
            IX = 9
            XL = 40
            XC = 90
            CD = 400
            CM = 900
        */
        // To achieve this conversion, we can go from left to right as normal and use a switch statement
        // to find the value of each character in the string. If we run into I, X, or C, we can check
        // the next character in the string for if there is a special instance as above. If there is, 
        // we can put that into the switch statement and move the index pointer forward to th next value.

        // Pseudocode Start
        /*
            Initialize end integer as 
            int convertedValue

            for statement to loop through the given string from left to right
                There are two goals in this for statement. 
                The first is to check for a special condition.
                The second is to add numbers to the convertedValue integer for each loop.
                Both can be done in the same switch statement with a check in the switch statement
                for special condition characters.

                switch(s.charAt(i)) {
                    case I:
                        if (s.chatAt(i+1) == V && i != s.length())
                            Add 4 to convertedValue
                            i++
                        if (s.chatAt(i+1) == X && i != s.length())
                            Add 9 to convertvalued
                            i++
                        else
                            Add 1 to convertedValue
                    case V:
                        Add 5 to convertedValue
                    case X:
                        if (s.chatAt(i+1) == V && i != s.length())
                            Add 40 to convertedValue
                            i++
                        if (s.chatAt(i+1) == X && i != s.length())
                            Add 90 to convertvalued
                            i++
                        else
                            Add 10 to convertedValue      
                    case L:
                        Add 50 to convertedValue                
                    case C:
                        if (s.chatAt(i+1) == V && i != s.length())
                            Add 400 to convertedValue
                            i++
                        if (s.chatAt(i+1) == X && i != s.length())
                            Add 900 to convertvalued
                            i++
                        else
                            Add 100 to convertedValue
                    case D:
                        Add 500 to convertedValue
                    case M:
                        Add 1000 to convertedValue

                }
            return convertedValue
        */
        // End Pseudocode

        // Initializing convertedValue variable
        int convertedValue = 0;

        // For statement to loop through given string variable s
        for (int i = 0; i < s.length(); i++){
            // Switch statement to add value to convertedValue variable based on current loop. Each one will add
            // a value to the variable convertedValue. I, X, and C will check for a special condition.
            switch(s.charAt(i)){
                case 'I':
                    // Checks for a possible out of bounds error. If there is another character after i, it will
                    // check for a special condition.
                    if (i != s.length()-1){
                        if (s.charAt(i+1) == 'V'){
                            convertedValue = convertedValue + 4;
                            i++;
                            break;
                        } else if (s.charAt(i+1) == 'X'){
                            convertedValue = convertedValue + 9;
                            i++;
                            break;
                        }
                    }
                    convertedValue = convertedValue + 1;
                    break;
                case 'V':
                    convertedValue = convertedValue + 5;
                    break;
                case 'X':
                    // Checks for a possible out of bounds error. If there is another character after i, it will
                    // check for a special condition.
                    if (i != s.length()-1){
                        if (s.charAt(i+1) == 'L'){
                            convertedValue = convertedValue + 40;
                            i++;
                            break;
                        } else if (s.charAt(i+1) == 'C'){
                            convertedValue = convertedValue + 90;
                            i++;
                            break;
                        }
                    }
                    convertedValue = convertedValue + 10;
                    break;
                case 'L':
                    convertedValue = convertedValue + 50;
                    break;
                case 'C':
                    // Checks for a possible out of bounds error. If there is another character after i, it will
                    // check for a special condition.
                    if (i != s.length()-1){
                        if (s.charAt(i+1) == 'D'){
                            convertedValue = convertedValue + 400;
                            i++;
                            break;
                        } else if (s.charAt(i+1) == 'M'){
                            convertedValue = convertedValue + 900;
                            i++;
                            break;
                        }
                    }
                    convertedValue = convertedValue + 100;
                    break;
                case 'D':
                    convertedValue = convertedValue + 500;
                    break;
                case 'M':
                    convertedValue = convertedValue + 1000;
                    break;
            }
        }
        return convertedValue;
    }
}