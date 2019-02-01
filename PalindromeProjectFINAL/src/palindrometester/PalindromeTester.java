/**
 *
 * Title:           Assignment LinkedList of a Palindrome
 *
 * Due Date: 11/24/2018
 *
 * Description of program, & explanation of programming concept(s) being applied
 * in program. This program will ask the user for the input file, create two linkedlist one
 * Palindrome and NOT a Palindrome, and print out the results.
 */
package palindrometester;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeTester {

    public static void main(String[] args) {
        // Testing Palindrome integers in list
        HelperPal helperPal = new HelperPal();
        LinkedList goodTest = new LinkedList();

        goodTest.add("0");
        goodTest.add("1");
        goodTest.add("2");
        goodTest.add("1");
        goodTest.add("0");

        System.out.println(helperPal.isPalindrome(goodTest));

        goodTest.clear();
        // Testing not Palindrome integers in list
        goodTest.add("0");
        goodTest.add("1");
        goodTest.add("2");
        goodTest.add("3");
        goodTest.add("4");

        System.out.println(helperPal.isPalindrome(goodTest));

        boolean check = true;
        // Asking the user for the file name, keep looping until right file is type
        while (check) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter Filename : input.txt : ");
            String file = input.nextLine();
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String word;
                while ((word = br.readLine()) != null) {

                    if (helperPal.isPalindrome(helperPal.makeLinkedList(word))) {
                        System.out.println(word + " is Palindrome");
                    } else {
                        System.out.println(word + " is not Palindrome");
                    }

                }
                check = false;
            } catch (IOException e) {
                check = true;
            }
        }
    }
}
