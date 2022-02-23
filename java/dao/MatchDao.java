package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import model.Match;

public class MatchDao implements IDAO<Match>{
	
	Connection connect = Connect.getConnection();

	@Override
	public boolean create(Match object) {
		boolean msg = false;
		try {
			PreparedStatement req = connect.prepareStatement(
					"INSERT INTO contest(game_id, start_date, winner_id)"
							+ " VALUES (?,?,?)");
			req.setInt(1, object.getGame_id());
			req.setString(2, object.getDate());
			req.setInt(3, object.getWinner_id());
		
			

			req.executeUpdate();

			System.out.println("matchajouté à la base! ");
			msg = true;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Insertion match KO");
		}
		return msg;
	}

	@Override
	public List<Match> read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Match object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Match object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Match findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Match findByName(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
