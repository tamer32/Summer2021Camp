package steam.demo.services;

import java.util.List;

import steam.demo.entites.Game;

public interface ShopService {
	
	public void addGame(Game gameToBeAdded);
	
	public List<Game> getExistingGames();
	
	public Long getAddedGames();
	
	public void deleteGame(Long id);
}
