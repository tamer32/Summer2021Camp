package steam.demo.entites;

public class Player {
	private String username;
	private int level;
	private int numberOfAchievements;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getNumberOfAchievements() {
		return numberOfAchievements;
	}
	public void setNumberOfAchievements(int numberOfAchievements) {
		this.numberOfAchievements = numberOfAchievements;
	}
}
