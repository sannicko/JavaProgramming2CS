/**

  Title:           Sum of Arrays Recursively 

   Due Date:      11/11/2018

    Description of program, & explanation of programming concept(s) being  applied in program
    This program will calculate the sum of the arrays using a recursive method.
 */

package sumarraysrecursively;

public class SumArraysRecursively {


    // Creating the array
    // Calling the method, using recursion
    public static void main(String[] args) {

        int arr[] = {10, 100, 1000};

        int sum = sumRecursive(arr, arr.length);

    // Sum of the array printed
        System.out.println("The sum of the Array is: " + sum);

    }

    // Returning the sum of the elements in Arr[0..Num-1]
    // Using recursion
    public static int sumRecursive(int Arr[], int Num) {
        if (Num <= 0) {
            return 0;
        }
        return (sumRecursive(Arr, Num - 1) + Arr[Num - 1]);
    }

}
