package steam.demo.entites;

import java.util.List;

public class Game extends Software {
	
	private Integer numberOfAchievemnts;
	private Integer numberOfPlayers;
	private List<Player> players;
	private String serversLocation;
	

	public Game(Long id, String name) {
		super(id, name);
	}	
	public Integer getNumberOfAchievemnts() {
		return numberOfAchievemnts;
	}


	public void setNumberOfAchievemnts(Integer numberOfAchievemnts) {
		this.numberOfAchievemnts = numberOfAchievemnts;
	}


	public Integer getNumberOfPlayers() {
		return numberOfPlayers;
	}


	public void setNumberOfPlayers(Integer numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}


	public String getServersLocation() {
		return serversLocation;
	}


	public void setServersLocation(String serversLocation) {
		this.serversLocation = serversLocation;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Game [numberOfAchievemnts=" + numberOfAchievemnts + ", numberOfPlayers=" + numberOfPlayers
				+ ", players=" + players + ", serversLocation=" + serversLocation + "," + super.toString();
	}	
	
	
}
