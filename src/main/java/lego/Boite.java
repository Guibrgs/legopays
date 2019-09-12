package lego;


public class Boite {
	
	private int number;
	private String name;
	private int pieces;
	private int figurines;
	private int price;
	
	public Boite(int number, String name, int pieces, int figurines, int price) {
		super();
		this.number = number;
		this.name = name;
		this.pieces = pieces;
		this.figurines = figurines;
		this.price = price;
	}
			
	public int getPieces() {
		return pieces;
	}
	public void setPieces(int pieces) {
		this.pieces = pieces;
	}
	public int getFigurines() {
		return figurines;
	}
	public void setFigurines(int figurines) {
		this.figurines = figurines;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean compareTo(Boite boite) {
		return "MotherFucker";
		
		
	}

}
