import java.util.Scanner; //declare scanner object to take in info

/*
    This program will output information about cotes a candidate recieved 
    include the number of votes for each candidate, percentage of total votes 
    and the total number of votes.
    */
public class VoteCalculations {

    public static final int SIZE = 2; //Final to use throughout the class
   
    /*
    Main method used to intake and output information.
    */
    public static void main(String[] args) {
        int nCount = 0;                             //count to use in loops
        Scanner input = new Scanner(System.in);     //initialize scanner
        String[] saCandidate = new String[SIZE];    //string array of 6 to hold candidate name
        int[] nNumOfVotes = new int[SIZE];          //int array of 6 to hold number of votes for each candidate
        int nTotal = 0;                             //declare and initialize int to hold the total number of votes
        double[] dPercentage = new double[SIZE];    //double array of 6 to hold the percentage of votes for each cadidate
        
        //for loop to recieve data in the arrays
        for (nCount = 0; nCount < SIZE; nCount++) {                     //for loop to loop 6 times
            System.out.print("Please enter the candidate's name: ");    //asks user to input candidate name
            saCandidate[nCount] = input.next();                         //user entered information goes into saCandidate array
            System.out.print("Please enter the number of votes: ");     //asks user to input number of candidate votes
            nNumOfVotes[nCount] = input.nextInt();                      //user entered information goes into nNumOfVotes array
            System.out.println("");                                     //space to slipt up information to look nice :)
        } //end for loop to recieve data
        
        //call for nTotal
        nTotal = calculateTotal(nNumOfVotes);   
        //nTotal will be used in main method, calculateTotal is the name of the method its calling, nNumOfVotes is being fed into the method
        
                
        //for loop to compute percentage of votes in array
        for (nCount = 0; nCount < SIZE; nCount++) {     //for loop to loop 6 times
            dPercentage[nCount] = (double) ( nNumOfVotes[nCount] * 100 )/ nTotal;
            //dPercentage for each nCount is equal to nNumOfVotes for each nCount *100 then divided by the total number of votes
        } //end for loop to compute percentage of votes
        
        //return output
        System.out.println("Candidate           Votes         Percentage");     //print out heading
        //Loop to print candidate votes
        for (nCount = 0; nCount < SIZE; nCount++){      //for loop to loop 6 times
            System.out.println(saCandidate[nCount] + "          " + nNumOfVotes[nCount] + "         " + dPercentage[nCount] + "%");
            //print out     saCandidate for each count                 nNumOfVotes for each nCount      percentage calcuation for each nCount
            System.out.println("");         //space to split up output to look nicer :)
        }//end for loop to print candidtate votes
        System.out.println("Total        " + nTotal);       //print out the total number of votes
        
 } //end main method
    
    //method to calculate the total
    public static int calculateTotal(int [] nVotes) {   //using nVotes as nNumOfVotes from main method
        int nIndex = 0;     //int to hold index (equivalent to nCount)
        int nTotal = 0;     //int to hold the total
        
    //for loop to compute the total
        for (nIndex = 0; nIndex < SIZE; nIndex++) {     //for loop to loop 6 times
            nTotal = nTotal + nVotes[nIndex];           //equation to calculate total by adding each nVotes number for each nIndex
        } //end for loop to compute totals
        
        return nTotal;      //return the total value to main method
    }// end calculateTotal method
        
} //end public class
