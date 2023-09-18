import java.util.*;
import static java.lang.System.*;

public class trafficJam {
public static void main (String [] args) {
    
    System.out.printf("\n\n");

	int victory = 0;
	String color;

	int openSpace = 5;
	int[] blueTrains = {6,7,8,9};
	int[] redTrains = {1,2,3,4};
	String[] spaces = {" "," "," "," "," "," "," "," "," "," ",};
	

	System.out.printf("Welcome to Traffic Jam\n\n");
	System.out.printf("Your goal is to switch the places of the Red & Blue Trains. \nTrains can only move onto the empty space \neither by moving one space forward \nor by jumping over an opposite colored train.\n");
	System.out.printf("\nType 'r' to move Red Trains\n");
	System.out.printf("Type 'b' to move Blue Trains\n");
	System.out.printf("Type 'q' to quit and reload\n");
	
		for (int i = 0; i < spaces.length; i++) {

			if (i == openSpace) {
				spaces[i] = " ";
			}
			
			for (int j = 0; j < redTrains.length; j++) {
				if (redTrains[j] == i + 1) {
					spaces[i] = "R";
				}
			}

			for (int g = 0; g < blueTrains.length; g++) {
				if (blueTrains[g] == i + 1) {
					spaces[i] = "B";
				}
			}
		}
	System.out.printf("\n\n[1] [2] [3] [4] [5] [6] [7] [8] [9]\n");
	System.out.printf("[%s] [%s] [%s] [%s] [%s] [%s] [%s] [%s] [%s]\n",spaces[0],spaces[1],spaces[2],spaces[3],spaces[4],spaces[5],spaces[6],spaces[7],spaces[8]);

	Scanner kb = new Scanner(System.in);

while (victory == 0) {

	System.out.printf("Which color would you like to move? \n");
	color = kb.nextLine();

	if (color.equals("r") || color.equals("R")) {
		if (redTrains[3] < openSpace) {
			if (redTrains[3] + 1 == openSpace) {
				redTrains[3]++;
				openSpace--;
			} else if (redTrains[3] + 2 == openSpace) {
				redTrains[3]+=2;
				openSpace-=2;
			} else {
				System.out.printf("Invalid Move. Try again.\n");
			} 
		} else if (redTrains[2] < openSpace) {
			if (redTrains[2] + 1 == openSpace) {
				redTrains[2]++;
				openSpace--;
			} else if (redTrains[2] + 2 == openSpace) {
				redTrains[2]+=2;
				openSpace-=2;
			} else {
				System.out.printf("Invalid Move. Try again.\n");
			} 
		} else if (redTrains[1] < openSpace) {
			if (redTrains[1] + 1 == openSpace) {
				redTrains[1]++;
				openSpace--;
			} else if (redTrains[1] + 2 == openSpace) {
				redTrains[1]+=2;
				openSpace-=2;
			} else {
				System.out.printf("Invalid Move. Try again.\n");
			} 
		} else if (redTrains[0] < openSpace) {
			if (redTrains[0] + 1 == openSpace) {
				redTrains[0]++;
				openSpace--;
			} else if (redTrains[0] + 2 == openSpace) {
				redTrains[0]+=2;
				openSpace-=2;
			} else {
				System.out.printf("Invalid Move. Try again.\n");
			} 
		} else {
			System.out.printf("Invalid Move. Try again.\n");
		}
				
	} else if (color.equals("b") || color.equals("B")) {
		if (blueTrains[0] > openSpace) {
			if (blueTrains[0] - 1 == openSpace) {
				blueTrains[0]--;
				openSpace++;
			} else if (blueTrains[0] - 2 == openSpace) {
				blueTrains[0]-=2;
				openSpace+=2;
			} else {
				System.out.printf("Invalid Move. Try again.\n");
			}
		} else if (blueTrains[1] > openSpace) {
			if (blueTrains[1] - 1 == openSpace) {
				blueTrains[1]--;
				openSpace++;
			} else if (blueTrains[1] - 2 == openSpace) {
				blueTrains[1]-=2;
				openSpace+=2;
			} else {
				System.out.printf("Invalid Move. Try again.\n");
			} 
		} else if (blueTrains[2] > openSpace) {
			if (blueTrains[2] - 1 == openSpace) {
				blueTrains[2]--;
				openSpace++;
			} else if (blueTrains[2] - 2 == openSpace) {
				blueTrains[2]-=2;
				openSpace+=2;
			} else {
				System.out.printf("Invalid Move. Try again.\n");
			} 
		} else if (blueTrains[3] > openSpace) {
			if (blueTrains[3] - 1 == openSpace) {
				blueTrains[3]--;
				openSpace++;
			} else if (blueTrains[3] - 2 == openSpace) {
				blueTrains[3]-=2;
				openSpace+=2;
			} else {
				System.out.printf("Invalid Move. Try again.\n");
			} 
		} else {
			System.out.printf("Invalid Move. Try again.\n");
		}

	} else if (color.equals("q")) {
		victory = 2;
	} else {
		System.out.println("\nInvalid Move. Try again.\n");
	}

	System.out.printf("\n\n[1] [2] [3] [4] [5] [6] [7] [8] [9]\n");
		for (int i = 0; i < spaces.length; i++) {
			for (int j = 0; j < redTrains.length; j++) {
				if (redTrains[j] == i + 1) {
					spaces[i] = "R";
				}
			}

			for (int g = 0; g < blueTrains.length; g++) {
				if (blueTrains[g] == i + 1) {
					spaces[i] = "B";
				}
			}
			
			if (i + 1 == openSpace) {
				spaces[i] = " ";
			}
		}

	System.out.printf("[%s] [%s] [%s] [%s] [%s] [%s] [%s] [%s] [%s]\n",spaces[0],spaces[1],spaces[2],spaces[3],spaces[4],spaces[5],spaces[6],spaces[7],spaces[8]);
	
	if (redTrains[0] == 6 && blueTrains[3] == 4) {
		victory = 1;
		System.out.println("You win!");
	}
}
	if (victory == 2) {
		System.out.println("You lost.");
	}
	System.out.printf("\n\n");
}
}
