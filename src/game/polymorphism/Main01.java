package game.polymorphism;

public class Main01 {

	public static void main(String[] args) {
		// Warrior하나, Orc하나를 생성해주세요.
		Warrior w1 = new Warrior("이개창");
		Orc o1 = new Orc();
		Slime s1 = new Slime();
		Goblin g1 = new Goblin();
		
		w1.hunt(s1);
		System.out.println("-------------------");
		w1.hunt(g1);
		System.out.println("-------------------");
		w1.hunt(o1);
	}
}
