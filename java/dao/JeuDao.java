package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import model.Jeu;

public class JeuDao implements IDAO<Jeu>{
	
	Connection connect = Connect.getConnection();

	@Override
	public boolean create(Jeu object) {
		boolean msg = false;
		try {
			PreparedStatement req = connect.prepareStatement(
					"INSERT INTO game (title, min_players, max_players)"
							+ " VALUES (?,?,?)");
			req.setString(1, object.getTitle());
			req.setInt(2, object.getMin_players());
			req.setInt(3, object.getMax_players());
			

			req.executeUpdate();

			System.out.println("jeu ajouté à la base! ");
			msg = true;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Insertion jeu KO");
		}
		return msg;
	}

	@Override
	public List<Jeu> read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Jeu object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Jeu object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Jeu findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jeu findByName(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
