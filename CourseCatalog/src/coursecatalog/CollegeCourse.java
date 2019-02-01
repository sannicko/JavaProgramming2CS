/**
 *
 *
 * Description of program, & explanation of programming concept(s) being applied
 * in program This program read a file, load the data into an array list, sort &
 * print by Course Name and Title, search by Course Name and title add lines
 * course, name title and credit hours and add it into the original file.
 */
package coursecatalog;

import java.util.Comparator;

public class CollegeCourse implements Comparable {

    private String courseName;
    private int credit;
    private String courseTitle;

    // Constructor for college course object
    public CollegeCourse(String courseName, int credit, String courseTitle) {
        this.courseName = courseName;
        this.credit = credit;
        this.courseTitle = courseTitle.trim();
    }

    // Special constructor to be used for instantiation during searching
    public CollegeCourse(String stringToSearch) {
        this.courseName = this.courseTitle = stringToSearch;
        this.credit = 0;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public String getCourseTitle() {
        return this.courseTitle;
    }

    @Override
    public String toString() {
//  maybe better displaye? return "Course name: " + this.courseName + " Credit: " + this.credit + " Title: " + this.courseTitle;
        return this.courseName + "	" + this.credit + "	" + this.courseTitle;
    }

    @Override
    public int compareTo(Object other) {
        CollegeCourse otherCourse = (CollegeCourse) other;
        return this.courseName.compareTo(otherCourse.courseName);
    }

}

// Class comparator by course name, used for sorting courses in ascending based on course name
class ComparatorByCourseName implements Comparator<CollegeCourse> {

    // Used for sorting courses in ascending based on course name
    @Override
    public int compare(CollegeCourse a, CollegeCourse b) {
        return a.getCourseName().compareTo(b.getCourseName());
    }
}

// Class comparator by course title, used for sorting courses in ascending based on course title
class ComparatorByCourseTitle implements Comparator<CollegeCourse> {

    // Used for sorting titles in ascending based on course title
    @Override
    public int compare(CollegeCourse a, CollegeCourse b) {
        return a.getCourseTitle().compareTo(b.getCourseTitle());
    }
}
