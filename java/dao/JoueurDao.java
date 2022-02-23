package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;


import model.Joueur;

public class JoueurDao implements IDAO<Joueur>{
	
	Connection connect = Connect.getConnection();

	@Override
	public boolean create(Joueur object) {
		boolean msg = false;
		try {
			PreparedStatement req = connect.prepareStatement(
					"INSERT INTO player(email, nickname)"
							+ " VALUES (?,?)");
			req.setString(1, object.getEmail());
			req.setString(2, object.getNickname());
		
			

			req.executeUpdate();

			System.out.println("joueur ajouté à la base! ");
			msg = true;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Insertion joueur KO");
		}
		return msg;
	}

	@Override
	public List<Joueur> read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Joueur object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Joueur object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Joueur findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Joueur findByName(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
