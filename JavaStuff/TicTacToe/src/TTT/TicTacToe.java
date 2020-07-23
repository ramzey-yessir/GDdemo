package TTT;
import java.util.Scanner;

public class TicTacToe {
	
	public static void main(String[] args) { 
	
	Scanner scan = new Scanner(System.in);
	
	boolean stillPlaying = true; //used to run tictactoe infinitely
	boolean playerTurn = true; //player 1 - true , player 2 - false
	boolean validInput;
	boolean gameFinished;
	
	
	// Initializing players
	System.out.println("Welcome to Tic Tac Toe!");
	System.out.println("Enter name of Player 1: ");
	String player1 = scan.next();
	point scoreOne =  new point();
	scoreOne.getpoint1();
	System.out.println("Enter name of Player 2: ");
	String player2 = scan.next();
	point scoreTwo =  new point();
	scoreTwo.getpoint2();
	


	while(stillPlaying == true) {
		
		int counter = 0;
		gameFinished = false;
		System.out.println(player1 + ' ' + scoreOne.getpoint1() + ' ' + '|' + '|' + ' ' + scoreTwo.getpoint2() + ' ' + player2); // scoreboard
		
		char [][] gameBoard = {{' ',  '|', ' ', '|',' '}, //initialize table
				{'-' , '+', '-', '+','-'},				 
				{' ',  '|', ' ', '|',' '},
				{'-' , '+', '-', '+','-'}, 
				{' ',  '|', ' ', '|',' '}};
		
		for(char[] row : gameBoard) {
			for(char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
		
		
		while(gameFinished == false) {
			counter += 1;
			validInput = false;
			if(playerTurn == true) {
				System.out.println(player1 + "'s Turn. Enter a number from 1-9:");
				int userInput1 = scan.nextInt();
				while(validInput = false) {
					if(userInput1 == 1 && gameBoard[0][0] == ' ') {
						gameBoard[0][0] = 'X';
						validInput = true;
						}
					else if(userInput1 == 2 && gameBoard[0][2] == ' ') {
						gameBoard[0][2] = 'X';
						validInput = true;
					}
					else if(userInput1 == 3 && gameBoard[0][4] == ' ') {
						gameBoard[0][4] = 'X';
						validInput = true;
					}
					else if(userInput1 == 4 && gameBoard[2][0] == ' ') {
						gameBoard[2][0] = 'X';
						validInput = true;
					}
					else if(userInput1 == 5 && gameBoard[2][2] == ' ') {
						gameBoard[2][2] = 'X';
						validInput = true;
					}
					else if(userInput1 == 6 && gameBoard[2][4] == ' ') {
						gameBoard[2][4] = 'X';
						validInput = true;
					}
					else if(userInput1 == 7 && gameBoard[4][0] == ' ') {
						gameBoard[4][0] = 'X';
						validInput = true;
					}
					else if(userInput1 == 8 && gameBoard[4][2] == ' ') {
						gameBoard[4][2] = 'X';
						validInput = true;
					}
					else if(userInput1 == 9 && gameBoard[4][4] == ' ') {
						gameBoard[4][4] = 'X';
						validInput = true;
					}
					else {
						System.out.println("Sorry, invalid input! Try again!");
					}
				
				}
				for(char[] row : gameBoard) {
					for(char c : row) {
						System.out.print(c);
					}
					System.out.println();
				}
				playerTurn = false;
				
			}
				
				
			else if(playerTurn == false) {
				System.out.println(player2 + "'s Turn. Enter a number from 1-9:");
				int userInput2 = scan.nextInt();
				while(validInput = false) {
					if(userInput2 == 1 && gameBoard[0][0] == ' ') {
						gameBoard[0][0] = 'O';
						validInput = true;
						}
					else if(userInput2 == 2 && gameBoard[0][2] == ' ') {
						gameBoard[0][2] = 'O';
						validInput = true;
					}
					else if(userInput2 == 3 && gameBoard[0][4] == ' ') {
						gameBoard[0][4] = 'O';
						validInput = true;
					}
					else if(userInput2 == 4 && gameBoard[2][0] == ' ') {
						gameBoard[2][0] = 'O';
						validInput = true;
					}
					else if(userInput2 == 5 && gameBoard[2][2] == ' ') {
						gameBoard[2][2] = 'O';
						validInput = true;
					}
					else if(userInput2 == 6 && gameBoard[2][4] == ' ') {
						gameBoard[2][4] = 'O';
						validInput = true;
					}
					else if(userInput2 == 7 && gameBoard[4][0] == ' ') {
						gameBoard[4][0] = 'O';
						validInput = true;
					}
					else if(userInput2 == 8 && gameBoard[4][2] == ' ') {
						gameBoard[4][2] = 'O';
						validInput = true;
					}
					else if(userInput2 == 9 && gameBoard[4][4] == ' ') {
						gameBoard[4][4] = 'O';
						validInput = true;
					}
					else {
						System.out.println("Sorry, invalid input! Try again!");
					}
					
					}
				for(char[] row : gameBoard) {
					for(char c : row) {
						System.out.print(c);
					}
					System.out.println();
				}
				playerTurn = true;
			
			}
			

			if((winCheck.row1(gameBoard) == true || winCheck.row2(gameBoard) == true || winCheck.row3(gameBoard) == true || winCheck.col1(gameBoard) == true || 
					winCheck.col2(gameBoard) == true || winCheck.col3(gameBoard) == true || winCheck.diag1(gameBoard) == true || winCheck.diag2(gameBoard) == true) && counter >= 5) {
					
				if(playerTurn == false) {
					System.out.println(player1 + " wins!");
					playerTurn = false; //allows loser to have the first move next game
					scoreOne.incpoint1();

				}
				
				else if(playerTurn == true) { 
					System.out.println(player2 + " wins!");
					playerTurn = true; // allows loser to have the first move next game
					scoreTwo.incpoint2();
				}
				
				System.out.println(player1 + ' ' + scoreOne.getpoint1() + ' ' + '|' + '|' + ' ' + scoreTwo.getpoint2() + ' ' + player2);
				
				validInput = false;
				
				
				while(validInput == false) {
					System.out.println("Play again? (Y/N)");
					String playAgain = scan.next();
					if(playAgain == "Y" || playAgain == "y") {
						validInput = true;
					}
					else if(playAgain == "N" || playAgain == "n") {
						stillPlaying = false;
						validInput = true;		
					}
					else {
						System.out.println("Invalid input! Try again!");
					}
					
					
					}
						
				}
			}
			
		scan.close();
		System.out.println("Thanks for playing!");					
		}
	}



}
