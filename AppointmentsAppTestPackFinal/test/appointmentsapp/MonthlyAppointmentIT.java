/**

  Title:           Assignment Phone Book Array
  Semester:        COP3337 – Fall 2018
  @author          5867108
   Instructor:     C. Charters
  
   Due Date:      11/24/2018

    Description of program, & explanation of programming concept(s) being  applied in program
    This program will test the classes and the functionability of the AppoinmentApp.
 */
package appointmentsapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cristy
 */
public class MonthlyAppointmentIT {

    public MonthlyAppointmentIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.

        AppointmentsApp myAppts = new AppointmentsApp();  //instantiate the driver class (main class)
        //Create the Appointments array with 3 types of appointments:
        myAppts.myAppointments = new Appointment[1];
        myAppts.myAppointments[0] = new MonthlyAppointment(10, "Skin Clean");

        //Tests the day when a user has an appointment
        int expectedResult = 10;
        int result = myAppts.myAppointments[0].getDay();
//        System.out.println("Result : " + result);
        assertEquals(expectedResult, result);

        //Test monthly appointments
        boolean expectedResultB = true;
        boolean resultB = myAppts.myAppointments[0].occursOn(2018, 12, 10);
        assertEquals(expectedResultB, resultB);

        //Test value returned toString method of MonthlyAppointment
        String expectedResultC = "Skin Clean";
        String resultC = myAppts.myAppointments[0].toString();
//        System.out.println("Result C: " + resultC);
        assertTrue(resultC.contains(expectedResultC));
    }

}
