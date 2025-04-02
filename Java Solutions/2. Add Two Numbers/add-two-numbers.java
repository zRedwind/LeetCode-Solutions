/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /* Initial thoughts
         Both list nodes need to be broken into integers that can be added together.
         Both initial lists are in backwards order due to how they are stored.
         Since first number is stored first, second number is stored second, they end up backwards.
         Summed number needs to be put back in. 

         Instead of the above, it can be treated as addition backwards, with the ones places being on the left
         243
         564
         Since 4 and 6 is in the tens place and equals 10, we can carry the one and set the tens place to 0
         Since we carried the one, the hundreds place is 3 + 4 + 1 = 8
         708

         Since this can be done in this manner, we should be able to loop through the listnodes, adding together
         each numbers place and carrying the extra value to the next numbers place.  
        */

        /* Ending Thoughts
         While the logic behind how to find the numbers was correct, moving through the linked lists proved
         to be the most difficult part of the problem. A base understanding of how linked lists work and how
         they work was researched and implemented. A base ListNode, defined as l3, was created with a new
         ListNode variable equal to l3 being created to manipulate the data. This keeps l3 as a starting point
         for the solution linked list. l4 then has data stored and moved to the next point as needed during the
         program, allowing l3 to start at the beginning of the linked list.
        */

        // Initialization of List Nodes l3 and l4. l3 is the start object while l4 will be used to
        // create future node objects.
        ListNode l3 = new ListNode();
        ListNode l4 = l3;

        // Boolean values to track when the given linked lists are null.
        boolean l1Null = false;
        boolean l2Null = false;

        // Initializing sum and remainder for loop
        int sum = 0;
        int remainder = 0;

        while (l1Null == false || l2Null == false || remainder == 1) {
            // This while loop loops as long as there is a value from the current node lists or remainder.
            // It adds the values together and finds out if there is a remainder. It then stores
            // the values into a new ListNode object and creates the next node for the linked list.
            // It then incriments to the next value in both given linked lists, checking if there is a value or
            // if they are null.

            // Adding current numbers and remainder from last loop.
            if (l1Null == false){
                sum = sum + l1.val;
            }
            if (l2Null == false){
                sum = sum + l2.val;
            }
            sum = sum + remainder;

            // Checking for if there is a remainder and subtracting 10 from sum if there is. Sets to 0 if there 
            // is no remainder.
            if (sum >= 10){
                remainder = 1;
                sum = sum - 10;
            } else {
                remainder = 0;
            }

            // Sets value of current l4 linkedlist node to sum value and incriments to next node
            l4.next = new ListNode(sum);
            l4 = l4.next;

            // Moving to next integer in linked list
            if (l1Null == false)
                l1 = l1.next;
            if (l2Null == false)
                l2 = l2.next;

            // Checking for if next integer is null and setting boolean values to true if it is
            if (l1 == null)
                l1Null = true;
            if (l2 == null)
                l2Null = true;

            // Sets sum to 0 for next loop.
            sum = 0;
        }
        // Returns the l3 LinkedList starting at the frst saved value.
    return  l3.next;
    }
}