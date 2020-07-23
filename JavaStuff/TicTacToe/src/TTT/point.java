package TTT;

public class point {
	
	public int player1 = 0;
	public int player2 = 0;

	
	public int incpoint1() {
		player1 += 1;
		return player1;	
	}
	public int incpoint2() {
		player2 += 1;
		return player2;	
	}
	public int getpoint1() {
		return player1;	
	}
	public int getpoint2() {
		return player2;	
	}
	

}
