/**

  Title:           Using Comparable and Comparator Interfaces
    Description of program, & explanation of programming concept(s) being  applied in program
    This program will create a curse directory where the user can add course names, year, credits
    * then sort them and compare them using array list and Comparator object and compareTo() method.
    *
 */
package coursedirectory;

import java.util.ArrayList;
import java.util.Comparator;


public class Course implements Comparable {

    private String FIUCourseName;
    private String FloridaCourseName;
    private int yearLevel;
    private int numCredits;
    private ArrayList<String> prerequisites;

    public Course(String anFIUCourseName, String aFloridaCourseName, int aYearLevel, int aNumCredits, ArrayList<String> myPreReqs) {
        FIUCourseName = anFIUCourseName;
        FloridaCourseName = aFloridaCourseName;
        yearLevel = aYearLevel;
        numCredits = aNumCredits;
        prerequisites = new ArrayList<String>(myPreReqs);

    }

    public String getFIUCourseName() {
        return FIUCourseName;
    }

    public void setFIUCourseName(String FIUCourseName) {
        this.FIUCourseName = FIUCourseName;
    }

    public String getFloridaCourseName() {
        return FloridaCourseName;
    }

    public void setFloridaCourseName(String FloridaCourseName) {
        this.FloridaCourseName = FloridaCourseName;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public int getNumCredits() {
        return numCredits;
    }

    public void setNumCredits(int numCredits) {
        this.numCredits = numCredits;
    }

    public ArrayList<String> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(ArrayList<String> prerequisites) {
        this.prerequisites = new ArrayList<String>(prerequisites);
    }

    @Override
    public String toString() {
        return "Course{" + "FIUCourseName=" + FIUCourseName + ", FLodiraCourseName=" + FloridaCourseName + ", yearLevel=" + yearLevel + ", numCredits=" + numCredits + ", prerequisites=" + prerequisites + '}';
    }

    @Override
    public int compareTo(Object other) {
        Course otherCourse = (Course) other;
        return this.FIUCourseName.compareTo(otherCourse.FIUCourseName);
    }

}

class ComparatorByYear implements Comparator<Course> {

    //Used for sorting courses in ascending based on year level
    public int compare(Course a, Course b) {
        return a.getYearLevel() - b.getYearLevel();
    }
}

class ComparatorByFLACourse implements Comparator<Course> {

    //Used for sorting courses in ascending based on year level
    public int compare(Course a, Course b) {
        return a.getFloridaCourseName().compareTo(b.getFloridaCourseName());
    }
}
