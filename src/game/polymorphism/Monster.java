package game.polymorphism;

public class Monster {

	// hp,atk 을 변수(속성,필드)로 가집니다.
	private int hp;
	private int atk;
	private String name;
	private int exp;
	
	// 생성자까지 만들어주세요.
	// 체력과 공격력이 몬스터별로 다 달라야 하니 입력받게 해주세요.
	public Monster(int hp,int atk,String name,int exp) {
		this.hp = hp;
		this.atk = atk;
		this.name = name;
		this.exp = exp;
	}
	// doBattle(int)를 생성해주세요.
	// 사용자의 공격력 uAtk만큼 몬스터의 체력이 깎이고
	// 체력이 0이 되면 해당 몬스터와 교전이 불가능하다는 메세지를 남겨줍니다.
	// 체력이 0보다 높으면 남은 체력을 마지막에 콘솔창에 띄워줍니다.
	public void doBattle(int uAtk) {
		this.hp -= uAtk;
		System.out.println(this.name + "(이/가) 공격을 받았습니다.");
		System.out.println("체력이 " + this.hp + "남았습니다.");
	}
	
	// getter/setter를 생성해주세요.
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
}
