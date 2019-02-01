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
public class AppointmentAppJUnitTesterIT {

    public AppointmentAppJUnitTesterIT() {

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

    /**
     * Test of main method, of class Demo.
     */
    @Test

    public void testMain() {
        System.out.println("main");
        String[] args = null;

        AppointmentsApp myAppts = new AppointmentsApp();  //instantiate the driver class (main class)
        //Create the Appointments array with 3 types of appointments:
        myAppts.myAppointments = new Appointment[3];
        myAppts.myAppointments[0] = new OneTimeAppointment(2018, 10, 19, "Birthday Celebration");
        myAppts.myAppointments[1] = new DailyAppointment("Trainer Workout");
        myAppts.myAppointments[2] = new MonthlyAppointment(15, "manicure");

        //Create tests for occursOn() method, and then do Assertions to test if the results are as expected:
        //Test OneTime Appointments 
        boolean expectedResult = true;
        boolean result = myAppts.myAppointments[0].occursOn(2018, 10, 19);
        assertEquals(expectedResult, result);

        expectedResult = false;
        result = myAppts.myAppointments[0].occursOn(2018, 10, 21);
        assertEquals(expectedResult, result);

        //Test Daily Appointments
        expectedResult = true;
        result = myAppts.myAppointments[1].occursOn(2018, 11, 15);
        assertEquals(expectedResult, result);

        //Test Monthly Appointments        
        expectedResult = true;
        result = myAppts.myAppointments[2].occursOn(2018, 10, 15);
        assertEquals(expectedResult, result);

        expectedResult = false;
        result = myAppts.myAppointments[2].occursOn(2018, 10, 19);
        assertEquals(expectedResult, result);

    }
}
    
