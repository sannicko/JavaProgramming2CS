/**
 *
 *
 * Description of program, & explanation of programming concept(s) being applied
 * in program This program will display the a phone book and add, remove, change and
 * display contact from the phone book using arrays with a GUI interface.
 */
package bestfriendsphonebookarray;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class BFFHelperArray {

    ArrayList<BestFriend> myBFFs = new ArrayList<BestFriend>();

//    BestFriend[]myBFFs;
    public BFFHelperArray() //object
    {
        BestFriend contact = new BestFriend("firstName", "lastName", "nickName", "cellPhone", "email");
//        myBFFs = new BestFriend[10];

    }

    //1.grab information
    //2.create a BestFriend contact
    //3.add it to the list
    public void addAFriend() {
        System.out.println("Please insert your contact first name");
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        System.out.println("Please insert your contact last name");
        String lastName = input.nextLine();
        System.out.println("Please insert your contact nick name");
        String nickName = input.nextLine();
        System.out.println("Please insert your contact phone number");
        String cellPhone = input.nextLine();
        System.out.println("Please insert your contact email address");
        String email = input.nextLine();
        BestFriend contact = new BestFriend(firstName, lastName, nickName, cellPhone, email); //Creating a new BestFriend
        myBFFs.add(contact);
        System.out.println("this is the addAFriend Method" + contact);

    }

    //Overiding addFriend method to work with User Interface
    public void addAFriend(String firstName, String lastName, String nickName, String cellPhone, String email) {
        System.out.println("BEFORE: The length of array list is " + myBFFs.size());
        BestFriend contact = new BestFriend(firstName, lastName, nickName, cellPhone, email); //Creating a new BestFriend
        myBFFs.add(contact);
        System.out.println("this is the addAFriend Method" + contact);
        System.out.println("ATFER: The length of array list is " + myBFFs.size());
        System.out.println("The added object is: " + myBFFs.get(0).toString());
        System.out.println("Is myBFF empty? " + myBFFs.isEmpty());
    }

    //1. Call search method
    //2. if statement - if returnCode == -1 then message to user saying NOT FOUND
    //3. else retrieve the object in arraylist at the returnCode position, display it
    //4. Ask user for all the data of the friend
    //5. change the object values using the setters
    //6. Put the object back into the arrayList using the set method
    public void changeAFriend() {
        System.out.println("this is the changeAFriend Method");

        int friendPosition = searchAFriend();
        if (friendPosition < 0) {
            System.out.println("Your contact is not on the Phone Book");

        } else {
            System.out.println("The contact to be change is: " + myBFFs.get(friendPosition)); //.get(friendPosition));
            System.out.println("Please insert the new name");
            Scanner input = new Scanner(System.in);
            String firstName = input.nextLine();
            System.out.println("Please insert the new last name");
            String lastName = input.nextLine();
            System.out.println("Please insert the new nickname");
            String nickName = input.nextLine();
            System.out.println("Please insert the new cellPhone");
            String cellPhone = input.nextLine();
            System.out.println("Please insert the new email");
            String email = input.nextLine();
            myBFFs.get(friendPosition).setFirstName(firstName);
            myBFFs.get(friendPosition).setLastName(lastName);
            myBFFs.get(friendPosition).setNickName(nickName);
            myBFFs.get(friendPosition).setCellPhone(cellPhone);
            myBFFs.get(friendPosition).setEmail(email);
            System.out.println("Your new contact information is" + myBFFs.get(friendPosition));
        }
    }

    public void changeFriend(int friendPosition, BestFriend friendToChange) {
        myBFFs.get(friendPosition).setFirstName(friendToChange.getFirstName());
        myBFFs.get(friendPosition).setLastName(friendToChange.getLastName());
        myBFFs.get(friendPosition).setNickName(friendToChange.getNickName());
        myBFFs.get(friendPosition).setCellPhone(friendToChange.getCellPhone());
        myBFFs.get(friendPosition).setEmail(friendToChange.getEmail());

    }

    //1. Call search method
    //2. if statement - if returnCode == -1 then message to user saying NOT FOUND
    //3. else retrieve the object in array at the returnCode position, display it
    //4. ask the user, are you sure you want to remove that friend?
    //5. if user say YES, remove from the array to object pointed at by the retunCode of the search method
    // your friend has been remove
    //6. else another message
    public void removeAFriend() {
        System.out.println("This is the removeAFriend Method");

        int friendPosition = searchAFriend();
        if (friendPosition < 0) {
            System.out.println("Your contact is not on the phonebook");
        } else {
            System.out.println("The contact to be removed is" + myBFFs.get(friendPosition));
            //myBFFs[i]friendPosition);
            System.out.println("Your friend has been succesfully removed.");
        }
    }

    public void removeAFriend(int index) {
        myBFFs.remove(index);
    }

    public ArrayList<BestFriend> displayAllFriends() {
        return this.myBFFs;
    }

    public void displayAFriend() {
        System.out.println("This is the displayAFriend Method");
        System.out.println("Please select option 1 to display a specific BestFriend's information");
        System.out.println("Please select option 2 to display all BestFriend's information");
        int answer;
        Scanner input = new Scanner(System.in);

        answer = input.nextInt();

        switch (answer) {

            case 1:
                int friendPosition = searchAFriend();
                if (friendPosition < 0) {
                    System.out.println("Your contact is not in the list");
                } else {
                    System.out.println("Your contact information is" + myBFFs.get(friendPosition));

                }

                break;

            case 2:
                if (myBFFs.isEmpty()) {
                    System.out.println("Your list of friends is empty");
                } else {
                    for (int c = 0; c < myBFFs.size(); c++) {
                        System.out.println(myBFFs.get(c).toString());
                    }
                }
        }

    }

    public String displaySpecificFriend(String firstName, String lastName, String nickName) {
        BestFriend friendToDisplay = new BestFriend(firstName, lastName, nickName);
        int friendPosition = searchAFriend(friendToDisplay);
        if (friendPosition < 0) {
            return "A friend with name " + firstName + " does not exist";
        } else {
            return myBFFs.get(friendPosition).toString();
        }
    }

//1. Ask for first name, last name, nick name
//2. User provides info, anw we store it in variables
//3. Create a search object with the overloaded constructor
// int i =0;
// i++
//4. Make a loop, do while loop condition: while (!(searchObj.equals(myBFFs.get(i)) && i < myBFFs.size())
//5. if the object is equal found if searchObj is equal to the myBFFs.get (i) then you found the friend!
//else
// return -1;
// after running this method no need to pass
    public int searchAFriend() {
        System.out.println("Please insert your contact first name");
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        System.out.println("Please insert your contact last name");
        String lastName = input.nextLine();
        System.out.println("Please insert your contact nick name");
        String nickName = input.nextLine();
        BestFriend searchingFriend = new BestFriend(firstName, lastName, nickName);
        int i = 0;
        boolean foundFlag = false;

        do {
///[i]
            if (searchingFriend.getFirstName().equalsIgnoreCase(myBFFs.get(i).getFirstName())
                    && searchingFriend.getLastName().equalsIgnoreCase(myBFFs.get(i).getLastName())
                    && searchingFriend.getNickName().equalsIgnoreCase(myBFFs.get(i).getNickName())) {
                foundFlag = true;
            } else {
                i++;
            }

        } while (i < myBFFs.size() && foundFlag == false);

        if (foundFlag == true) {
            return i;
        } else {
            return -1;
        }
    }

    //Overriding the search funciton to work with the GUI
    public int searchAFriend(BestFriend searchingFriend) {
        int i = 0;
        boolean foundFlag = false;

        do {
///[i]
            if (searchingFriend.getFirstName().equalsIgnoreCase(myBFFs.get(i).getFirstName())
                    && searchingFriend.getLastName().equalsIgnoreCase(myBFFs.get(i).getLastName())
                    && searchingFriend.getNickName().equalsIgnoreCase(myBFFs.get(i).getNickName())) {
                foundFlag = true;
            } else {
                i++;
            }

        } while (i < myBFFs.size() && foundFlag == false);

        if (foundFlag == true) {
            return i;
        } else {
            return -1;
        }
    }

}
