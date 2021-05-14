package Entities;

public class Sale {
	private int saleId;
	private Game game;
	private User user;
	
	public Sale() {}
	
	public Sale(int saleId, Game game, User user) {
		this.saleId = saleId;
		this.game = game;
		this.user = user;
	}

	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
