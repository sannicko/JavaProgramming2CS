/**
 *
 * Description of program, & explanation of programming concept(s) being applied
 * in program This program will display the a phone book and add, remove, change and
 * display contact from the phone book using arrays with a GUI interface.
 */
package bestfriendsphonebookarray;

public class BestFriend {

    private String firstName;
    private String lastName;
    private String nickName;
    private String cellPhone;
    private String email;
//constructor

    public BestFriend(String firstName, String lastName, String nickName, String cellPhone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.cellPhone = cellPhone;
        this.email = email;
    }
//overloaded constructor to find objects with very miminum information, 3 attributes

    public BestFriend(String firstName, String lastName, String nickName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "BestFriend{" + "firstName=" + firstName + ", lastName=" + lastName + ", nickName=" + nickName + ", cellPhone=" + cellPhone + ", email=" + email + '}';
    }

    //method very important when comparing objects equal method
    @Override
    public boolean equals(Object obj) {
        BestFriend other;
        if (obj == null) {
            return false;
        }

        if (obj instanceof BestFriend) {
            other = (BestFriend) obj;
        } else {
            return false;
        }

        if (firstName.equals(other.firstName)
                && lastName.equals(other.lastName)
                && nickName.equals(other.nickName)) {
            return true;
        } else {
            return false;
        }

    }

}
