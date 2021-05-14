package Entities;

public class Game extends Entity{
	private int gameId;
	private String gameName;
	private double unitPrice;
	
	public Game(String gameName) {
		super(gameName);
	}
	
	public Game(int gameId, String gameName, double unitPrice) {
		super(gameName);
		this.gameId = gameId;
		this.gameName = gameName;
		this.unitPrice = unitPrice;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		super.setName(gameName);
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
