package model;

public class Model {
	public static final boolean WHITE = true, BLACK = false;
	public static final int KING = 1, QUEEN = 2, BISHOP = 3, KNIGHT = 4, ROOK = 5, PAWN = 6;
	private int [][] board;
	private int kingW, queenW, kingB, queenB;
	private int [] bishopW, knightW, rookW, pawnW, bishopB, knightB, rookB, pawnB;
	public Model() {
		board = new int [8][8];
		kingW = 1;
		queenW = 2;
		bishopW = new int [2];
		knightW = new int [2];
		rookW = new int [2];
		pawnW = new int [8];
		kingB = -1;
		queenB = -2;
		bishopB = new int [2];
		knightB = new int [2];
		rookB = new int [2];
		pawnB = new int [8];
	}
	public void initFigures() {
		for(int i = 0; i<bishopW.length; ++i) {
			bishopW[i] = i+3; // 3, 4
		}
		for(int i = 0; i<knightW.length; ++i) {
			knightW[i] = i+5; // 5, 6
		}
		for(int i = 0; i<rookW.length; ++i) {
			rookW[i] = i+7; // 7, 8
		}
		for(int i = 0; i<pawnW.length; ++i) {
			pawnW[i] = i+9; // 9 - 16
		}
		for(int i = 0; i>bishopB.length*-1; --i) {
			bishopB[i] = i-3; // -3, -4
		}
		for(int i = 0; i>knightB.length*-1; --i) {
			knightB[i] = i-5; // -5, -6
		}
		for(int i = 0; i>rookB.length*-1; --i) {
			rookB[i] = i-7; // -7, -8
		}
		for(int i = 0; i>pawnB.length*-1; --i) {
			pawnB[i] = i-9; // -9 - -16
		}
	}
	public void initBoard() {
		int figure = 0;
		for(int i = 0; i<board.length; ++i) {
			for(int j = 0; j<board[i].length; ++j) {
				switch(i) {
				case 0:
					switch(j) {
					case 0:
						figure = rookW[0];
						break;
					case 1: 
						figure = knightW[0];
						break;
					case 2:
						figure = bishopW[0];
						break;
					case 3:
						figure = queenW;
						break;
					case 4:
						figure = kingW;
						break;
					case 5:
						figure = bishopW[1];
						break;
					case 6:
						figure = knightW[1];
						break;
					case 7:
						figure = rookW[1];
						break;
					default:
						figure = 0;
					}
					break;
				case 1:
					figure = pawnW[j]; 
					break;
				case 6:
					figure = pawnB[j];
					break;
				case 7:
					switch(j) {
					case 0:
						figure = rookB[0];
						break;
					case 1: 
						figure = knightB[0];
						break;
					case 2:
						figure = bishopB[0];
						break;
					case 3:
						figure = queenB;
						break;
					case 4:
						figure = kingB;
						break;
					case 5:
						figure = bishopB[1];
						break;
					case 6:
						figure = knightB[1];
						break;
					case 7:
						figure = rookB[1];
						break;
					default:
						figure = 0;
					}
					break;
				default:
					figure = 0;
				}
				board[i][j] = figure;
			}
		}
	}
	public void moveFigure(int type, int source, int destination) {
		
	}
    public void kickFigure(int type) {
		
	}
	public boolean kingsDo() {
		return true;
	}
	public boolean queensDo() {
		return true;
	}
	public boolean bishopsDo() {
		return true;
	}
	public boolean knightsDo() {
		return true;
	}
	public boolean rooksDo() {
		return true;
	}
	public boolean pawnsDo() {
		return true;
	}
	public boolean check(boolean color) {
		return true;
	}
	public boolean checkMate(boolean color) {
		return true;
	}
	public void transformPawn(int type) {
		
	}
	public void reset() {
		initFigures();
		initBoard();
	}
}
