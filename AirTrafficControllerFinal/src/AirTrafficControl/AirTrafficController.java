/**
 *
 * Title:           Assignment Air Traffic Controller
 * Semester:        COP3337 – Fall 2018
 *
 * Due Date: 11/04/2018
 *
 * Description of program, & explanation of programming concept(s) being applied
 * in program. This program will open a txt file, create an Array, sort the Array
 * using selection sort method then compare the coordinates between X axis and Y
 * axis to check which planes are closer to each one.
 */
package AirTrafficControl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

/**
 *
 */
public class AirTrafficController {

    public static Location[] myLocations = new Location[19];

    private final static String FILE_PATH = "airplanesInMiami.txt";
    public static int fileSize = 0, flag = -1;

    public static void main(String[] args) {
        processFile();
        selectionSort(myLocations);
        display(findMinDist(myLocations), myLocations);
    }

    // Reading the data from the txt file
    public static boolean processFile() {

        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
            String data = null;
            String[] parts = null;

            while ((data = br.readLine()) != null) {
                data = data.replace(" ", "");
                parts = data.split(",");
                myLocations[fileSize] = new Location(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
                fileSize++;
            }

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found. Please check the file " + FILE_PATH);

        } catch (Exception e) {
            System.out.println(e.toString());

        }
        return false;

    }

    // Sorting the Array by X Axis. location, coordinates
    public static void selectionSort(Location[] location) {

        int[] arr = new int[fileSize];
        for (int index = 0; index < fileSize - 1; index++) {
            int minIndex = index;

            for (int secondIndex = index + 1; secondIndex < fileSize; secondIndex++) {
                if (arr[secondIndex] < arr[minIndex]) {
                    minIndex = secondIndex;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[index];
            arr[index] = (temp);
        }
        Arrays.sort(location);

        System.out.println("----- Array Sort by X Axis -----");  // Checking that the Array is sort my X axis
        for (int i = 0; i < myLocations.length; i++) {
            System.out.println(myLocations[i]);
        }
    }

    // Finding minimun distance between X and Y, return closest index
    public static int findMinDist(Location[] location) {
        int x1, x2, y1, y2, index = 0;
        double distanceBetween2Points, currentDistance;

        try {
            x1 = location[index].getxLoc();
            x2 = location[index + 1].getxLoc();
            y1 = location[index].getyLoc();
            y2 = location[index + 1].getyLoc();

            distanceBetween2Points = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            flag = 0;

            index += 2;

            for (; index < fileSize; index += 2) {
                if (index == 18) {
                    break;
                }

                x1 = location[index].getxLoc();
                x2 = location[index + 1].getxLoc();
                y1 = location[index].getyLoc();
                y2 = location[index + 1].getyLoc();

                currentDistance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

                if (currentDistance < distanceBetween2Points) {
                    distanceBetween2Points = currentDistance;
                    flag = index;
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return flag;
    }

    // Loop to printcontent in Array
    public static void display() {

        for (Location l : myLocations) {
            System.out.println(l.getxLoc() + " " + l.getyLoc());
        }
    }

    // Display method distance between X and Y and show warning
    public static void display(int flag, Location[] location) {

        System.out.println("");
        System.out.println("***** ALERT THESE TWO PLANES ARE CLOSE *****");
        System.out.println("");
        System.out.println("Plane @ X-axis:" + location[flag].getxLoc() + " and Y-axis:" + location[flag].getyLoc());
        System.out.println(" ***** is CLOSE to ***** ");
        System.out.println("Plane @ X-axis:" + location[flag + 1].getxLoc() + " and Y-axis:" + location[flag + 1].getyLoc());

    }

}
