package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Player;
import com.revature.util.ConnFactory;

public class PlayerDaoImpl implements PlayerDao {
	public static ConnFactory cf = ConnFactory.getInstance();

	
	@Override
	public List<Player> getAllPlayers() throws SQLException {
		List<Player> PlayerList=new ArrayList<Player>();
		Connection conn= cf.getConnection();
		java.sql.Statement stmt= conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from \"Player\"");
		Player a = null;
		while (rs.next()) {
			a=new Player(rs.getInt(1),rs.getString(2),rs.getInt(3));
			PlayerList.add(a);
		}
		return PlayerList;
	}


	@Override
	public List<Player> getPlayersById(int id) throws SQLException {
		List<Player> PlayerList=new ArrayList<Player>();
		Connection conn= cf.getConnection();
		//Statement stmt= conn.createStatement();
		//ResultSet rs = stmt.executeQuery("select * from \"Player\" where a\"ArtistId\"= "+id); // multiple ways to do this
		//ResultSet rs = stmt.executeQuery("select * from \"Player\" where ?");
		

		String sql = "select * from \"Player\" where \"ArtistId\" = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);   // this replaces the 1st ? with id 
		ResultSet rs= ps.executeQuery();
		Player a = null;
		while (rs.next()) {
			a=new Player(rs.getInt(1),rs.getString(2),rs.getInt(3));
			PlayerList.add(a);
		}
		return PlayerList;
	}

	

}
