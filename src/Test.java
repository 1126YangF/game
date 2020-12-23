public class Test {

	public static void main(String[] args) {

		Player player = new Player("小明", 3);
		Game game = new Game(player);
		game.start();
	}

}
