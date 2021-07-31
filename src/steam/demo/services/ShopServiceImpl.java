package steam.demo.services;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import steam.demo.entites.Game;

public class ShopServiceImpl implements ShopService {
	
	private List<Game> existingGames = new LinkedList<>();
	
	private Long addedGames = Long.valueOf("1");
	
	private static ShopService shopService;
	
	private ShopServiceImpl() {}
	
	public static ShopService getInstance() {
		if(Objects.isNull(shopService)) {
			return new ShopServiceImpl();
		}
		return shopService;
	}
	
	@Override
	public void addGame(Game gameToBeAdded) {
		addedGames++;
		existingGames.add(gameToBeAdded);
	}

	@Override
	public List<Game> getExistingGames() {
		return existingGames;
	}
	
	@Override
	public Long getAddedGames() {
		return addedGames;
	}

	@Override
	public void deleteGame(Long id) {
		existingGames.removeIf(game -> id.equals(game.getId()));
	}
	

}
