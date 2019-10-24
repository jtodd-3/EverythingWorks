package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Player;


public interface PlayerDao {
	//CRUD OPS
		public List<Player> getAllPlayers() throws SQLException;
		public List<Player> getPlayersById(int id) throws SQLException;
		
		

}
