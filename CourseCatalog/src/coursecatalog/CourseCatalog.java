/**
 *
 * Description of program, & explanation of programming concept(s) being applied
 * in program This program read a file, load the data into an array list, sort &
 * print by Course Name and Title, search by Course Name and title add lines
 * course, name title and credit hours and add it into the original file.
 */
package coursecatalog;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CourseCatalog {

    // Array list to hold the courses
    static ArrayList<CollegeCourse> catalog = new ArrayList<CollegeCourse>();

    // New object of class CollegeCourse
    static CollegeCourse course; // = new CollegeCourse();

    // Scanner object to get user input
    static Scanner in = new Scanner(System.in);

    // Name of the file to read and write
    static String fileName = "SCISCourses2.txt";

    public static void main(String[] args) {

        System.out.println("***** Course Catalog Menu *****");
        System.out.println("");
        try {
            PrintMenu();
        } catch (IOException ex) {
            Logger.getLogger(CourseCatalog.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Method to display menu
    static void PrintMenu() throws IOException {
        try {
            System.out.println("Please select one option from the below MENU :");
            System.out.println("");
            System.out.println("***** MENU *****");
            System.out.println("0. Input File, Print Contents");
            System.out.println("1. Sort and Print by Course Name");
            System.out.println("2. Sort and Print by Course Title");
            System.out.println("3. Search by Course Name");
            System.out.println("4. Search by Course Title");
            System.out.println("5. Add Course to Catalog File");
            System.out.println("6. Quit");
            System.out.print("Enter your selected option: ");

            int userOption = in.nextInt();

            System.out.println("You have selected option # " + userOption);

            switch (userOption) {
                case 0:
                    PrintContents();
                    break;
                case 1:
                    SortPrintByName();
                    break;
                case 2:
                    SortPrintByTitle();
                    break;
                case 3:
                    SearchByName();
                    break;
                case 4:
                    SearchByTitle();
                    break;
                case 5:
                    AddCourse();
                    break;
                case 6:
                    Quit();

                    break;
                default:
                    System.out.println("Please select only option 0 to 6");
                    break;
            }
            // Catching Exceptions
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found. Please check the name" + fileName);
            // PrintMenu();
        } catch (InputMismatchException ex) {
            System.out.println("Invalid character detected. Please try again");
            // PrintMenu();
        } catch (NumberFormatException ex) {
            System.out.println("Invalid character detected. Please try again");
            // PrintMenu();
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("The index you requested, could not be found");
            // PrintMenu();
        } catch (IOException e) {
            System.out.println("There was a problem reading the file, please call CS department");
            // PrintMenu();
        } catch (Exception ex) {
            // PrintMenu();
        }

    }

    // Method to display content
    static void PrintContents() throws IOException {
        System.out.println("Method to Display Contents");
        System.out.println("Please enter the file name: SCISCourses2.txt : ");
        in.nextLine();
        fileName = in.nextLine();
        System.out.println("Attempting to open: " + fileName);
        // Try and Catch Exceptions
        try {
            String name, title;
            int coursecredit;

            File file = new File(fileName);
            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {
                name = input.next();
                name += " " + input.next();
                coursecredit = input.nextInt();
                title = input.nextLine();
                course = new CollegeCourse(name, coursecredit, title);
                catalog.add(course);
            }
            input.close();

            // Catching Exceptions
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found. Please check the name" + fileName);
            PrintMenu();
        } catch (InputMismatchException ex) {
            System.out.println("Invalid character found. Please try again");
            PrintMenu();
        } catch (NumberFormatException ex) {
            System.out.println("Invalid character found. Please try again");
            PrintMenu();
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("The index you requested could not be found");
            PrintMenu();
        } catch (IOException e) {
            System.out.println("There was a problem reading the file, please call CS department");
            PrintMenu();
        } catch (Exception ex) {
            PrintMenu();
        }
        for (int x = 0; x < catalog.size(); ++x) {
            System.out.println(catalog.get(x).toString());
        }
        PrintMenu();
    }

    // Method to sort courses by name and display content
    static void SortPrintByName() throws IOException {
        System.out.println("***** Method to Sort Courses by Name and Display Results *****");
        System.out.println("***** Sorted by course Name *****");
        Collections.sort(catalog, new ComparatorByCourseName());
        for (int i = 0; i < catalog.size(); i++) {
            System.out.println(catalog.get(i));
        }
        PrintMenu();
    }

    // Method to sort courses by title display content
    static void SortPrintByTitle() throws IOException {
        System.out.println("***** Method to Sort Courses by Title and Display Results *****");
        System.out.println("***** Sorted by Course Title *****");
        Collections.sort(catalog, new ComparatorByCourseTitle());
        for (int i = 0; i < catalog.size(); i++) {
            System.out.println(catalog.get(i));
        }
        PrintMenu();
    }

    // Method to search courses by name and display results
    static void SearchByName() throws IOException {
        System.out.println("Method to Search Courses by Name and Display Results");
        System.out.println("Enter the name of the course: ");
        in.nextLine();
        String nameToSearch = in.nextLine();
        System.out.println("The course name to search is: " + nameToSearch);
        Collections.sort(catalog, new ComparatorByCourseName());
        ComparatorByCourseName c = new ComparatorByCourseName();
        int index = Collections.binarySearch(catalog, new CollegeCourse(nameToSearch), c);
        if (index >= 0) {
            System.out.println("***** FOUND ***** Course details: " + catalog.get(index).toString());
        } else {
            System.out.println("***** NOT FOUND ***** The course you searched for could not be found");
        }
        PrintMenu();
    }

    // Method to search courses by title and display results
    static void SearchByTitle() throws IOException {
        System.out.println("Method to Search Courses by Title and Display Results");
        System.out.println("Enter the title of the course: ");
        in.nextLine();
        String titleToSearch = in.nextLine();
        System.out.println("The course title to search is: " + titleToSearch);
        Collections.sort(catalog, new ComparatorByCourseTitle());
        ComparatorByCourseTitle c = new ComparatorByCourseTitle();
        int index = Collections.binarySearch(catalog, new CollegeCourse(titleToSearch), c);
        if (index >= 0) {
            System.out.println("***** FOUND ***** Course details: " + catalog.get(index).toString());
        } else {
            System.out.println("***** NOT FOUND ***** The course you searched for could not be found");
        }
        PrintMenu();
    }

    // Method to add courses to the file and display the content
    static void AddCourse() throws IOException {
        System.out.println("Method to Add Course to Catalog");
        // Capturing course name
        System.out.println("Enter course name : (Example: CIS 5910: )");
        in.nextLine();
        String name = in.nextLine();

        // Capturing credit
        System.out.println("Enter course credit : (Example: 1-2-3): ");
        int credit = in.nextInt();

        // Capturing course title
        System.out.println("Enter course title (Example: Project Research): ");
        in.nextLine();
        String title = in.nextLine();

        // Creating a course object
        CollegeCourse newCourse = new CollegeCourse(name, credit, title);

        try (FileWriter fw = new FileWriter(fileName, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {
            out.println("\n" + newCourse.toString());

        } catch (FileNotFoundException e) {
            System.out.println("The file was not found. Please check the name" + fileName);
            PrintMenu();
        } catch (InputMismatchException ex) {
            System.out.println("Invalid character detected. Please try again");
            PrintMenu();
        } catch (NumberFormatException ex) {
            System.out.println("Invalid character detected. Please try again");
            PrintMenu();
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("The index you requested for could not be found");
            PrintMenu();
        } catch (IOException e) {
            System.out.println("There was a problem reading the file, please call CS department");
            PrintMenu();
        } catch (Exception ex) {
            PrintMenu();
        }

    }

    // Method to quit the program
    static void Quit() {
        System.out.println("");
        System.out.println("Method to Quit the Program");
        System.exit(0);
    }
}
