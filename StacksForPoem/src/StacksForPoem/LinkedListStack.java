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

public class LinkedListStack {

    private static class Node {

        private String data;
        private Node next;

        private Node(String data) {
            this.data = data;
        }
    }

    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public String peek() {
        return top.data;
    }

    public void push(String data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    public String pop() {
        String data = top.data;
        top = top.next;
        return data;
    }
}
