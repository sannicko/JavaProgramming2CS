/**
 *
 *
 * Description of program, & explanation of programming concept(s) being applied
 * in program This program will display the a phone book and add, remove, change and
 * display contact from the phone book using arrays with a GUI interface.
 */
package bestfriendsphonebookarray;

import java.util.Scanner;

public class BestFriendsPhoneBookArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * TODO code application logic here // 1. Loop: 1. Add a BestFriend
         * object to their BFF arrayList 2. Change info of a BestFriend object
         * in their BFF arrayList 3. Remove a BestFriend object from their BFF
         * arrayList 4. Display a. a specific BestFriend's info (using their
         * last name and first name to search) b. all the BFF objects in the
         * arrayList 5. Exit a.display menu 2.get the users options 3.if or
         * swith 4. do while loop if not equal to 5 5.validation
         */

        //Setting the Phonebook Form to be visible
        PhoneBookForm form = new PhoneBookForm();
        form.setVisible(true);

        Scanner input = new Scanner(System.in);
        System.out.println("Please select one of the following options:");
        System.out.println("1. Add a BestFriend object to their BFF Array");
        System.out.println("2. Change info of a BestFriend object in their BFF Array ");
        System.out.println("3. Remove a BestFriend object from their BFF Array ");
        System.out.println("4. Display: a: A specific BestFriend's info using their last name and first name to search. "
                + "b: all the BFF objects in the Array ");
        System.out.println("5. Exit ");
        int answer;
        BFFHelperArray friendList = new BFFHelperArray();
        do {
            answer = input.nextInt();

            switch (answer) {
                case 1:
                    System.out.println("Adding a BestFriend object to the BFF Array");
                    friendList.addAFriend();
                    break;
                case 2:
                    System.out.println("Change info of a BestFriend object in their BFF Array");
                    friendList.changeAFriend();
                    break;
                case 3:
                    System.out.println("Remove a BestFriend object from their BFF Array");
                    friendList.removeAFriend();
                    break;
                case 4:
                    friendList.displayAFriend();
                    break;
                case 5:
                    System.out.println("Exit Thank you for Using the BFF Contact");
                    break;
                default:
                    System.out.println("Select only one of the five options");
            }

        } while (answer != 5);

    }
}
