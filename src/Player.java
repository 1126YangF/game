public class Player {
	private String name;//姓名
	private int score;//积分

	public Player(String name, int score){
		this.name = name;
		this.score = score;
	}

	public int Score() {
		return this.getScore();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
