package model;

public class Match {
	
	private int id;
	private int game_id;
	private String date;
	private int winner_id;
	
	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Match(int id, int game_id, String date, int winner_id) {
		super();
		this.id = id;
		this.game_id = game_id;
		this.date = date;
		this.winner_id = winner_id;
	}

	public Match(int nom_jeu, String start_date, int winner_id) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGame_id() {
		return game_id;
	}

	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getWinner_id() {
		return winner_id;
	}

	public void setWinner_id(int winner_id) {
		this.winner_id = winner_id;
	}

	@Override
	public String toString() {
		return "Match [id=" + id + ", game_id=" + game_id + ", date=" + date + ", winner_id=" + winner_id + "]";
	}
	
	

}
