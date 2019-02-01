package solvingstardesigns;

/**
 *
 * Title: Assignment Nested Loops  
 * Description of program, & explanation of programming concept(s) being applied
 * in program This program will run different loops in order to print a sequence
 * of starts
 */
public class SolvingStarDesigns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Instantiate the driver class, so you can call instance methods (& not static methods)
        SolvingStarDesigns myStars = new SolvingStarDesigns();

        // Printing using for loop method makeDesign1
        System.out.println("Printing Using For Loop");
        myStars.makeDesign1();

        // Printing using recursive method name makeDesignRowRecur
        System.out.println("Printing Using Recursive Method");
        myStars.makeDesignRowRecur(4);


        //myStars.makeDesign1Recur(5);
//         myStars.makeDesign2();
//         myStars.makeDesign3();
//         myStars.makeDesign4();
    }

    /**
     * Method printing from four asterisk to one asterisk in four rows
     *
     * @param i number of times looping
     * @param x number of asterisk printing
     */
    public void makeDesign1() {
        int x;
        for (int i = 0; i < 5; i++) // For loop is the one creating the rows
        {
            for (x = 4; x > i; x--) // Nested loop is the one creating the columns
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }

    // Using a recursive method to print the stars
    public static int makeDesign1Recur(int i) {

        if (i == 0) {
            return 0;
        }
        System.out.print("*");
        return (makeDesign1Recur(i - 1));
    }

    // Using a recursive method to print the rows
    public static int makeDesignRowRecur(int i) {
        if (i == 0) {
            return 0;
        }
        makeDesign1Recur(i);
        System.out.println("");
        return (makeDesignRowRecur(i - 1));

    }

//    For Loop and calling recurfirst part
//    public static void makeDesignRow(int i){
//       for ( int x = i; x>=0; x--){
//           makeDesign1Recur(x);
//           System.out.println("");
//       }
//
//    }
    /**
     * Method printing from one asterisk to five asterisk in five rows
     *
     * @param i number of times looping
     * @param x number of asterisk printing
     */
    public void makeDesign2() {
        int x;
        for (int i = 0; i < 5; i++) // For loop is the one creating the rows
        {
            for (x = 0; x <= i; x++)//nested loop is the one creating the columns
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }

    /**
     * Method printing from five asterisk to one asterisk in five rows
     *
     * @param i number of times looping
     * @param x number of asterisk printing
     */
    public void makeDesign3() {
        int x;
        for (int i = 0; i < 5; i++) // For loop is the one creating the rows
        {
            for (x = 4; x >= i; x--)//nested loop is the one creating the columns
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Method printing from one asterisk incrementing by two in four rows
     *
     * @param i number of times looping
     * @param x number of asterisk printing
     * @param z adding two numbers in order to get the odd values
     */
    public void makeDesign4() {
        int x;
        int z = 1;
        for (int i = 0; i < 4; i++) // For loop is the one creating the rows
        {
            for (x = 0; x < z; x++)//nested loop is the one creating the columns
            {
                System.out.print("*");
            }
            z = z + 2;
            System.out.println();
        }
        System.out.println();

    }

}
