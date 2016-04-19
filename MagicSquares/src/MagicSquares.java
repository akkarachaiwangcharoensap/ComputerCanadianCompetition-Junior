import java.util.*;
import java.io.*;

public class MagicSquares {
	public static void main(String[] args){
		boolean isMagicSquare = false;
		int[][] myArray = new int[4][4];
		int[] rowTotal = new int[4];
		int[] colTotal = new int[4];
		
		// Storing data
		for(int i = 0; i < myArray.length; i++){
			Scanner userInput = new Scanner(System.in);
			String input = userInput.nextLine();
			
			
			for(int n = 0; n < myArray[0].length; n++){
				String[] splitInput = input.split(" ");
				//System.out.print(splitInput[n]);
				myArray[i][n] = Integer.parseInt(splitInput[n]);
				
			}
		}
		
		// Outputing data
		/*for(int i = 0; i < myArray.length; i++){
			System.out.println();
			System.out.println(i + ":");
			System.out.println("--------------------");
			
			for(int n = 0; n < myArray[0].length; n++){
				System.out.print(myArray[i][n] + " ");
			}
			
			System.out.println();
			System.out.println("--------------------");
			
		}*/
		
		/* Row Adding */
		for(int a = 0; a < myArray.length; a++){
			for(int b = 0; b < myArray[0].length; b++){
				rowTotal[a] += myArray[a][b];
			}
		}
		
		/* Column Adding */
		for(int a = 0; a < myArray.length; a++){
			for(int b = 0; b < myArray[0].length; b++){
				colTotal[a] += myArray[b][a];
			}
		}
		
		for(int i = 0; i < myArray.length-1; i++){
			if(rowTotal[i] != rowTotal[i+1] || colTotal[i] != colTotal[i+1]){
				isMagicSquare = false;
			}else{
				isMagicSquare = true;
			}
		}
		
		if(isMagicSquare){
			System.out.println("Magic");
		}else{
			System.out.println("Not Magic");
		}
		
		/*System.out.println(rowTotal[0]);
		System.out.println(rowTotal[1]);
		System.out.println(rowTotal[2]);
		System.out.println(rowTotal[3]);
		System.out.println("----------------------");
		System.out.println(colTotal[0]);
		System.out.println(colTotal[1]);
		System.out.println(colTotal[2]);
		System.out.println(colTotal[3]);*/

		
		}
}
