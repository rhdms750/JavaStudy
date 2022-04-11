package enumTest;

enum Direction{
	EAST(1, ">"), SOUTH(2,"V"), WEST(3,"<"), NORTH(3,"^");

	private static final Direction[] DIR_ARR = Direction.values();
	private final int value;
	private final String symbol;
	
	Direction(int value, String symbol) {
		this.value = value;
		this.symbol = symbol;
	}
	
	public int getValue() {return value;}
	
	public String getSymbol() {return symbol;}
	
	public static directionOf(int dir) {
		if(dir < 1 || dir > 4) {
			throw new IllegalArgumentException("Invalid value : "+dir);
		}
		return DIR_ARR[dir-1];
	}
}

public class EnumEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
