11/9/2023
Sorting Arrays
Merges 2 arrays into 1
VSCode / JDK 11
*/

import java.util.Scanner;
import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //PART 1
        System.out.println("Enter the length of the 1st non-descending array:");
        int given_len1 = s.nextInt();


        /* USER VALIDATION

        boolean repeat = true;
        if(s.hasNextInt()){
            given_len1 = s.nextInt();
            while(repeat){
                if(given_len1>0){
                    repeat=false;
                }else{
                    System.out.println("Invalid Input. Must be positive");
                    given_len1= s.nextInt();
                }
            }
        }else{
            System.out.println("Invalid output. Try again");
            given_len1=s.nextInt();
        }

        */

        int array1[] = new int[given_len1];

        int counter= 0;

        while (counter < given_len1) {
            System.out.print("Enter an element: ");
            if (s.hasNextInt()) {
                int userInput = s.nextInt();
                array1[counter] = userInput;
                counter++;
            }
        }


        //PART 2
        System.out.println("Enter the length of the 2nd non-descending array:");
        int given_len2 = s.nextInt();

        /* USER VALIDATION

        boolean repeat = true;
        if(s.hasNextInt()){
            given_len1 = s.nextInt();
            while(repeat){
                if(given_len1>0){
                    repeat=false;
                }else{
                    System.out.println("Invalid Input. Must be positive");
                    given_len1= s.nextInt();
                }
            }
        }else{
            System.out.println("Invalid output. Try again");
            given_len1=s.nextInt();
        }

        */

        int array2[] = new int[given_len2];

        int counter2= 0;


        while (counter2 < given_len2) {
            System.out.print("Enter an element: ");
            if (s.hasNextInt()) {
                int userInput = s.nextInt();
                array2[counter2] = userInput;
                counter2++;
            }
        }

        //Merging Arrays
        int array3[] = new int[array1.length + array2.length];

        int inOne = 0;  
        int inTwo = 0;   
        int inThree = 0;  

        while(inOne < array1.length && inTwo < array2.length){
            if( array1[inOne]<= array2[inTwo]){
                
                array3[inThree] = array1[inOne];

                inOne ++; 
                inThree++;

            }else{
                array3[inThree] = array2[inTwo];

                inTwo++;
                inThree++;
            }
        }

        while(inOne < array1.length){
            array3[inThree] = array1[inOne];
            
            inOne++;
            inThree++;
        }

        while(inTwo < array2.length){
            array3[inThree] = array2[inTwo];

            inTwo++;
            inThree++;
        }

        //Printing the arrays

        System.out.println("The 1st array: " + Arrays.toString(array1));
        System.out.println("The 2st array: " + Arrays.toString(array2));
        System.out.println("Merged: " + Arrays.toString(array3));

    }
}  
