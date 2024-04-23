package starcraft.ver02;

public class Marine {

	private String name;
	private int power;
	private int hp;
	
	public Marine(String name) {
		this.name = name;
		power = 4;
		hp = 70;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	// 마린이 질럿을 공격합니다. attackZealot

	public void attack(Zealot z) {
		System.out.println(this.name + "이(가) " + z.genName() + "을 공격합니다.");
		z.beAttacked(this.power);
	}

	// 마린이 저글링을 공격합니다. attackZergling

	public void attack(Zergling ze) {
		System.out.println(this.name + "이(가) " + ze.getName() + "을 공격합니다.");
		ze.beAttacked(this.power);
	}

	public void beAttacked(int power) {
		// 방어적 코드 필요
		if (hp <= 0) {
			System.out.println("[" + this.name + "]" + "이(가) 이미 사망하였습니다.");
			hp = 0;
			return;
		}
		hp -= power;
	}

	public void showInfo() {
		System.out.println(" ==== 상태창 ==== ");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
	}

}
