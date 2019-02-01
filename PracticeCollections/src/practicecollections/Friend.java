/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicecollections;

public class Friend implements Comparable<Friend> {

    private int priorityFriend;
    private String firstName;
    private String lastName;

    public Friend(int priorityFriend, String firstName, String lastName) {
        this.priorityFriend = priorityFriend;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int compareTo(Friend otherFriend)
    {
       if (this.priorityFriend > otherFriend.priorityFriend)
       {    return 1;
       }
       else if (this.priorityFriend == otherFriend.priorityFriend)
       {
          return 0;
       }
       else
           return -1;
    }



    public int getPriorityFriend() {
        return priorityFriend;
    }

    public void setPriorityFriend(int priorityFriend) {
        this.priorityFriend = priorityFriend;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Friend{" + "priorityFriend=" + priorityFriend + ", firstName=" + firstName + ", lastName=" + lastName + '}';
    }



}
