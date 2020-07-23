package TTT;

public class winCheck {
	
	public static boolean row1(char[][] board) {
		if(board[0][0] == board[0][2] && board[0][2] == board[0][4]) {
			return true;
		}
		else {
			return false;
		}			
	}
	
	public static boolean row2(char[][] board) {
		if(board[2][0] == board[2][2] && board[2][2] == board[2][4]) {
			return true;
		}
		else {
			return false;
		}			
	}
	
	public static boolean row3(char[][] board) {
		if(board[4][0] == board[4][2] && board[4][2] == board[4][4]) {
			return true;
		}
		else {
			return false;
		}			
	}
	
	public static boolean col1(char[][] board) {
		if(board[0][0] == board[2][0] && board[2][0] == board[4][0]) {
			return true;
		}
		else {
			return false;
		}			
	}
	
	public static boolean col2(char[][] board) {
		if(board[0][2] == board[2][2] && board[2][2] == board[4][2]) {
			return true;
		}
		else {
			return false;
		}			
	}
	
	public static boolean col3(char[][] board) {
		if(board[0][4] == board[2][4] && board[2][4] == board[4][4]) {
			return true;
		}
		else {
			return false;
		}			
	}
	
	public static boolean diag1(char[][] board) {
		if(board[0][0] == board[2][2] && board[2][2] == board[4][4]) {
			return true;
		}
		else {
			return false;
		}			
	}
	
	public static boolean diag2(char[][] board) {
		if(board[0][4] == board[2][2] && board[2][2] == board[4][0]) {
			return true;
		}
		else {
			return false;
		}			
	}
	

}
