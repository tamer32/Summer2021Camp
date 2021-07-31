package steam.demo;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import steam.demo.entites.Game;
import steam.demo.services.ShopService;
import steam.demo.services.ShopServiceImpl;

public class EntryPoint {
	
	private static ShopService service = ShopServiceImpl.getInstance();
	private static Scanner scan = new Scanner(System.in);
	
	private static void printGames() {
		List<Game> existingGames = service.getExistingGames();
		for (Game game : existingGames) {
			System.out.println(game);
		}
	}
	
	private static void addGame() {
		System.out.println("What's the game name?");
		scan.nextLine();
		String gameName = scan.nextLine();
		System.out.println("What price?");
		double price = scan.nextDouble();
		Game newGame = new Game(service.getAddedGames(), gameName);
		newGame.setPrice(price);
		service.addGame(newGame);
	}

	public static void main(String[] args) {
		shopSession();
	}

	private static void shopSession() {
		System.out.println("Hello to our amazing shop! Please select service: ");
		System.out.println("1. List Available games");
		System.out.println("2. Add game");
		System.out.println("3. Delete game");
		int choosenValue = scan.nextInt();
		switch(choosenValue) {
		case 1:
			printGames();
			shopSession();
			break;
		case 2:
			addGame();
			shopSession();
			break;
		case 3:
			service.deleteGame(scan.nextLong());
			shopSession();
			break;
		}
	}
}
