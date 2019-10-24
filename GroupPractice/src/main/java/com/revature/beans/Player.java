package com.revature.beans;

public class Player {
	private int id;
	private String name;
	private int team_id;
	public Player(int id, String name, int team_id) {
		super();
		this.id = id;
		this.name = name;
		this.team_id = team_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", team_id=" + team_id + "]";
	}
	
	

}
