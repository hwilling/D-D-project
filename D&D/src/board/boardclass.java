package board;

public class boardclass {
	//board values
	private int boardLength;
	private int boardWidth;
	private int[][] board;
	//constructor
	boardclass(int boardLength, int boardWidth){
		this.boardLength = boardLength;
		this.boardWidth = boardWidth;
		this.board = new int[boardLength][boardWidth];
	}
	
	public int getBoardSpace(int boardLength, int boardWidth){
		return board[boardLength][boardWidth];
	}
	
	public void setBoardSpace(int boardLength, int boardWidth, int newVal){
		board[boardLength][boardWidth] = newVal;
	}
}
