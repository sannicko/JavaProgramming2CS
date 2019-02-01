/**
 *
 * Title:           Assignment Phone Book Array
 *
 * Due Date: 11/17/2018
 *
 * Description of program, & explanation of programming concept(s) being applied
 * in program.
 * This program will ask the user for a file name, after reading the file
 * it will push each word in a sentence onto a stack. Once the sentence is done,
 * pop the stack and print the sentence in reverse order.
 */
package StacksForPoem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class StackPoem {

    public static LinkedListStack stacky = new LinkedListStack();

    public static void main(String[] args) {
        readFileLoadStack();

        System.out.println("");
        System.out.println("");
    }

// Method to read the file named poem.txt add each word to the stack
    public static void readFileLoadStack() {
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter the file name: ");
            String fileName = keyboard.nextLine();
            File file = new File(fileName);
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNextLine()) {
                String line = inputFile.nextLine();
                String array[] = line.split(" ");
                for (int x = 0; x < array.length; x++) {
                    stacky.push(array[x]);
                }
                stacky.push("\n");
                popStackPrintMsg();

            }
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, invalid file name. Please try again.");
            readFileLoadStack();
        } catch (Exception e) {
            boolean fileNotFound = true;
            fileNotFound = true;
            System.out.println("Sorry, file error occurred.  Try again.");
        }

    }

// Method to access the stack and read it and display all words in backward order
    public static void popStackPrintMsg() {

        int caps = 0;
        while (!stacky.isEmpty()) {
            String poppedWord = stacky.pop();
            if (caps < 2) {
                String firstWord = poppedWord.substring(0, 1).toUpperCase() + poppedWord.substring(1);
                System.out.print(firstWord + " ");
            } else {
                System.out.print(poppedWord + " ");
            }
            caps++;
        }
    }

}
