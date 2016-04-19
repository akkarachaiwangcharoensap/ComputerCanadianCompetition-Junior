import java.util.*;
import java.io.*;

public class TournamentSelection {
	public static void main(String[] args){
		int winCounts = 0;
		int lossCounts = 0;
		int groupNum = 0;
		for(int i = 0; i < 6; i++){
			Scanner userInput = new Scanner(System.in);
			
			if (userInput.nextLine().equals("W")) {
				winCounts++;
			} else {
				lossCounts--;
			}

		}
		
		if( winCounts >= 5){
			groupNum = 1;
		}else if(winCounts >= 3){
			groupNum = 2;
		}else if(winCounts >= 2){
			groupNum = 3;
		}else{
			groupNum = -1;
		}
		
		System.out.println(groupNum);
	}
}
