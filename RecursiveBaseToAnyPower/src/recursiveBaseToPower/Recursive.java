/**
  Title:           Recursive Base to Any Power Assignment
 
   Due Date:      11/11/2018

    Description of program, & explanation of programming concept(s) being  applied in program
    This program will calculate the sum of the arrays using a recursive method.
 */

package recursiveBaseToPower;


public class Recursive {

    public static void main(String[] args) {


        // Calling non recursive method for loop and measure the number of nanoseconds
        long start = System.nanoTime();
        int answer1 = baseToPow(5, 3);
        System.out.println("Using a loop - The answer is :" + answer1);
        long time = System.nanoTime() - start;
        System.out.println("Total Nano Seconds: " + time);
        System.out.println("");


        // Calling recursive method and measure the number of nanoseconds
        long start2 = System.nanoTime();
        int base = 5;
        int power = 3;
        int answer2 = toPower(base, power);
        long time2 = System.nanoTime() - start2;
        System.out.println("Using Recursion - The answer is :" + answer2);
        System.out.println("Total Nanoseconds:  " + time2);

    }

    // Using recursion method always with if
    public static int toPower(int base, int power) {
        if (power != 0) {
            return (base * toPower(base, power - 1));
        } else {
            return 1;
        }
    }

    // Using loop none recursion
    public static int baseToPow(int base, int pow) {
        int answer = 1;
        for (int i = 1; i <= pow; i++) {
            answer = answer * base;
        }

        return answer;

    }

}
