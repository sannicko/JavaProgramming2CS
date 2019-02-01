/**
 *
 * Title:           Assignment LinkedList of a Palindrome
 *
 * Description of program, & explanation of programming concept(s) being applied
 * in program. This program will ask the user for the input file, create two linkedlist one
 * Palindrome and NOT a Palindrome, and print out the results.
 */
package palindrometester;

import java.util.LinkedList;

class HelperPal {

    // Method to check if the linkedlist is Palindrome
    public boolean isPalindrome(LinkedList aLL) {
        LinkedList reverseList = reverseAndClone(aLL);

        if (isEqual(aLL, reverseList)) {
            return true;
        }

        return false;
    }

    // Method to reverse and clone the linkedlist
    public LinkedList reverseAndClone(LinkedList aLL) {
        LinkedList reverseList = new LinkedList();

        for (int i = aLL.size() - 1; i >= 0; i--) {
            reverseList.add(aLL.get(i));
        }

        return reverseList;
    }

    // Method to compare the two linkedlist
    public boolean isEqual(LinkedList one, LinkedList two) {
        if (one.size() != two.size()) {
            return false;
        }

        for (int i = 0; i < one.size(); i++) {
            if (!(String.valueOf(one.get(i)).equals(String.valueOf(two.get(i))))) {
                return false;
            }
        }

        return true;
    }

    // Method to create the linkedlist
    public LinkedList makeLinkedList(String word) {
        LinkedList list = new LinkedList();

        for (int i = 0; i < word.length(); i++) {
            list.add(String.valueOf(word.charAt(i)));
        }
        return list;
    }
}
