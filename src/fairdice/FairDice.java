/* PROJECT:  FairDice
 * AUTHOR:  Dr. Kaminski  modified by: Drew Rautenberg
 * DESCRIPTION:  This project determines if a dice (technically, I should call
 *      it "die" for the singular of dice) is fair.
 *      That is, using the (pseudo) random number generator to simulate a dice
 *      face, are the number of times it comes up with 1, 2, 3, 4, 5, 6
 *      approximately equal.
 * TESTING:
 *      1) Run program multiple times with the 60/10 values for n & tolerancePct
 *              since different random numbers are generated each time you run
 *              the program.
 *      2) Change n to 600 & run multiple times - does a larger n help fairness
 *              ("in the long run")?
 *      3) Change tolerance to 20% instead of 10% & run program several times
 *              - that should help on the fairness judgement.
 ****************************************************************************/
package fairdice;
public class FairDice {

    public static void main(String[] args) {

        //----------------------------------------- DECLARE VARIABLES & OBJECTS
        int n = 60;                            // number of rolls to do
        int tolerancePct = 10;                 // % - see decideIfFair comments
        int c1 = 0;                            // the 6 counters
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        int c6 = 0;

        // >>>>> WRITE CODE HERE for declaring Random

        //------------------------------------------------ DO N ROLLS OF A DICE
        // FYI:  EACH roll requires:  roll 1 dice
        //                            a switch to ++ one of the 6 counters
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

        // >>>>> WRITE CODE HERE for doing the n rolls




        //-------------------------------- DECIDE FAIRNESS & WRITE FINAL ANSWER 
        boolean isFair = true;
//        isFair = decideIfFair(n,tolerancePct,c1,c2,c3,c4,c5,c6);       
        if (isFair)
            System.out.println("\tdice is FAIR");
        else
            System.out.println("\tdice is NOT FAIR");
    } // END OF main METHOD

    //************************************************** METHOD TO decideIfFair
    // ALGORITHM:
    // 1 - find maxTotal using Math.max method (since it's JUST 6 numbers)
    // 2 - find minTotal using Math.min method (ditto)
    // 3 - find difference between maxTotal & minTotal
    // 4 - specify equality as n / 6 (where n is a parameter)
    // 5 - find toleranceAmount as tolerancePct (a parameter) percent of equality
    // 6 - it's fair if the difference (step 3) is <= (2 * toleranceAmount) + 1
    //          [the 2* part allows for tolerance above/below equality
    //                  and the +1 includes equality itself]
    // EXAMPLE:  given n of 60, with counts of 10,9,8,10,12,11
    //           diffence is 12 - 8 which is 4
    //           equality would be 60 / 6 which is 10
    //           given tolerancePct of 10 (0.10 in calculations)
    //           toleranceAmount is 0.10 * 10 which is 1
    //           then (2*1)+1 is 3 (meaning counts of 9/10/11 is tolerable, but
    //                  a difference between highest & lowest count (12 & 8)
    //                  of 4 is not within tolerance
    //          CONCLUSION:  dice is NOT FAIR
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
//    private static boolean decideIfFair( >>>>> WRITE PARAMETERS HERE ) {

    // >>>>> WRITE METHOD BODY HERE to implement above algorithm


//        System.out.printf("FYI:  Doing %d rolls with tolerance of %d percent\n",
//                n, tolerancePct);  
//        System.out.printf("\twhere 6 counts are: %d, %d, %d, %d, %d, %d\n",
//                c1, c2, c3, c4, c5, c6);
//    }
    //-------------------------------------------------------------------------
} // END OF FairDice CLASS