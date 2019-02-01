/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicecollections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;


public class PracticeCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PracticeCollections pc = new PracticeCollections();
        pc.practiceStacks();
        pc.practiceQueues();
        pc.practicePriorityQueues();
    }

    public void practiceStacks()
    {
        Stack<String> aStack = new Stack<String>();
        aStack.push("wake up");
        aStack.push("get dressed");
        aStack.push("eat");
        aStack.push("drive to FIU");
        aStack.push("go to class");
        System.out.println("\nMy Stack: ");
        while (! aStack.empty())
        {
            System.out.println(aStack.pop());
        }


    }

    public void practiceQueues()
    {
        Queue<String> myQueue = new LinkedList<String>();
        myQueue.add("wake up");
        myQueue.add("get dressed");
        myQueue.add("eat");
        myQueue.add("drive to FIU");
        myQueue.add("go to class");
        System.out.println("\nMy Queue:");
        while (!myQueue.isEmpty())
        {
            System.out.println(myQueue.remove());
        }

    }

    public void practicePriorityQueues()
    {
        PriorityQueue<Friend> myFriends = new PriorityQueue<Friend>();
        myFriends.add(new Friend(5, "Mary", "Smith"));
        myFriends.add(new Friend(3, "John", "Jones"));
        myFriends.add(new Friend(1, "Bert", "Charters"));
        myFriends.add(new Friend(4, "Lola", "Barton"));
        myFriends.add(new Friend(2, "Luis", "Gonzalez"));

        System.out.println("\nMy Priority Queue: ");
        while (! myFriends.isEmpty())
        {
            System.out.println(myFriends.remove());
        }
    }

}
