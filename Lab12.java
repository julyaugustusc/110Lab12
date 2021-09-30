/*-------------------------------------------------------------------------
// AUTHOR: Augustus Crosby
// FILENAME: Lab12.java
// SPECIFICATION: reading files, 2D arrays, and input/output steams
// FOR: CSE 110- Lab #12
// TIME SPENT: 1 hour
//----------------------------------------------------------------------*/

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab12 {
	public static void main (String [] args) {

		// Declaring Variables

		// A String for the strings that we will read from file.
		

		// Declare the Array

		String [][] array1 = new String [4][3];
		// For reference, the following is an EXAMPLE declaration of an
		// String [] [] Array1 = new String [4][3];

		// Make a file
		/* Make a text file and write 12 strings in it, one string in each line, 
		and then save it in the folder that you want to save your program in it. 
		The text file and your java program must be in the same folder. */

		// read from the file
		

		//put all the commands of this step in the try block
		try
		{
			// Make a fileReader object to open the file that you want. You the name of the file that you //made in step 6
			
			FileReader fr = new FileReader ("file12");
		
			
			// define a buffer to read from the file
			BufferedReader inFile = new BufferedReader (fr);
			
			// use a for loop to read all lines of file
			
			for (int i = 0; i < 4; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					// this command put one line of file in a string variable
					array1[i][j] = inFile.readLine();
					// Array1[i][j]=line.;
				}
			}
			//close the file
			inFile.close();
		}

		catch(IOException e) {
			 System.out.println("I could not open the file :(");
		}


		// Print the array


		for (int i = 0; i < 4; i++){

			for (int j = 0; j < 3; j++){

				System.out.print (array1[i][j]+ " ");
			}

			System.out.println();
		}
		
	}
}