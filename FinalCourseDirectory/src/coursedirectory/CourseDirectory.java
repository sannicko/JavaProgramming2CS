/**

  Title:           Using Comparable and Comparator Interfaces


    Description of program, & explanation of programming concept(s) being  applied in program
    This program will create a curse directory where the user can add course names, year, credits
    * then sort them and compare them using array list and Comparator object and compareTo() method.
    *
 */
package coursedirectory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

 
public class CourseDirectory {

    //The courseList is an Array List holding objects of class Course
    ArrayList<Course> courseList = new ArrayList<Course>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CourseDirectory myDirectory = new CourseDirectory();
        myDirectory.createFIUCourses();
        myDirectory.displayMenu();

    }

    public void createFIUCourses() {
        Scanner input = new Scanner(System.in);
        //the anotherCourse variable is used to check if the user wants to input more courses into the system
        boolean anotherCourse = false;
        //the prerequisites is used to check if the user wants to add prerequisites to a course
        boolean prerequisites = false;
        //The course object from class Course is used to hold all the attributes of a given course
        //These attributes are; String anFIUCourseName, String aFLACourseName, int aYearLevel, int aNumCredits, ArrayList<String> myPreReqs
        Course course;

        //The do...while loop below is used to process the course information entered by the user
        do {
            System.out.println("Enter the FIU Course Name: ");
            String anFIUCourseName = input.nextLine();
            System.out.println("Enter the Florida Course Name: ");
            String aFloridaCourseName = input.nextLine();
            System.out.println("Enter the Year Level: ");
            int aYearLevel = Integer.parseInt(input.nextLine());
            System.out.println("Enter Number of Credits");
            int aNumCredits = Integer.parseInt(input.nextLine());
            System.out.println("Enter 1 to fill in prerequisites or 2 to skip");
            int preInt = Integer.parseInt(input.nextLine());

//            if(preInt == 1){
//                anotherCourse = true;
//            }else{
//                anotherCourse = false;
//            }
            //prerequisteList hold information about each prerequisite requirement to undertake a course FIU course
            ArrayList prerequisiteList = new ArrayList();
            //Checking if the user wants to add more prerequisites
            if (preInt == 1) {
                prerequisites = true;
                int count = 1;

                //This while loop will keep running as long as the user wants to add a prerequisite
                while (prerequisites) {
                    System.out.println("Prerequisite " + count + " is (write the prerequisite):");
                    String prereq = input.nextLine();
                    count++;

                    //Appending the course prerequisite into the prerequisiteList
                    prerequisiteList.add(prereq);
                    System.out.println("Enter 1 to fill in another prerequisites or 2 to exit");
                    int userInput = Integer.parseInt(input.nextLine());
                    switch (userInput) {
                        case 1:
                            prerequisites = true;
                            break;
                        case 2:
                            prerequisites = false;
                            break;
                        default: //if the user type different option than 1 or 2
                            System.out.println("Invalid entry, exiting prerequisites list");
                            prerequisites = false;
                            break;
                    }
                }
            }
            //Initializing the course object with attributes supplied by user
            course = new Course(anFIUCourseName, aFloridaCourseName, aYearLevel, aNumCredits, prerequisiteList);
            //Appending the course object into the courseList (ArrayList)
            courseList.add(course);
            //Checking if the user wants to add more courses
            System.out.println("Enter 1 to enter another course or 2 to skip");
            int moreCourse = Integer.parseInt(input.nextLine());
            if (moreCourse == 1) {
                anotherCourse = true;
            } else {
                anotherCourse = false;
            }
        } while (anotherCourse);

        //Create a loop that will ask user if he/she wants to create another course - do while
        //Inside loop, ask for all the information for a course
        //Create another loop inside the outer loop (nested loop) for prerequisites (while)
        //After the nested loop, create a Course object
        //Add Course object to arrayList of courses
    }

    public void displayMenu() {
        //Creating scanner (input) to be used for getting user input
        Scanner input = new Scanner(System.in);
        int userInput = 0;

        //If the user selects option 4, then the disply menu is terminated
        while (userInput != 4) {
            System.out.println("Select one option from the menu below");
            System.out.println("-------------------------------------");
            System.out.println("1. Sort courses by FIU course name");
            System.out.println("2. Sort courses by Florida course name");
            System.out.println("3. Sort courses by year level");
            System.out.println("4. Exit");
            userInput = Integer.parseInt(input.nextLine());

            //Using switch case to make decision about sorting method to apply
            //Colletctions method is called
            switch (userInput) {
                case 1:
                    System.out.println("Sorted by FIU course name");
                    Collections.sort(courseList);
                    for (int i = 0; i < courseList.size(); i++) {
                        System.out.println(courseList.get(i));
                    }
                    break;
                case 2:
                    System.out.println("Sorted by Florida course name");
                    Collections.sort(courseList, new ComparatorByFLACourse());
                    for (int i = 0; i < courseList.size(); i++) {
                        System.out.println(courseList.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Sorted by year level");
                    Collections.sort(courseList, new ComparatorByYear());
                    for (int i = 0; i < courseList.size(); i++) {
                        System.out.println(courseList.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the course directory");
                    break;
                default:
                    System.out.println("Invalid entry please select 1,2,3 or 4");
                    break;
            }

        }
        //Create a loop that displays the menu of options:
        //1. Sort courses by FIU course name
        //2. Sort courses by FLA course name
        //3. Sort courses by year level
        //4.  Exit
        //Keep looping until the user enters option 4
        //For each of the options 1- 3, call a specific method

    }

}
