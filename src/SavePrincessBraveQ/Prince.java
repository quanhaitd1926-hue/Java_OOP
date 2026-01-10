package SavePrincessBraveQ;

public class Prince {
	private int power, blood;
	private boolean alive;

	public Prince(int power, int blood, boolean alive) {
		super();
		this.power = power;
		this.blood = blood;
		this.alive = alive;
	}

	public String toString() {
		String live = "";
		if (this.alive)
			live = "ALIVE";
		else
			live = "DEAD";
		return "POWER : " + this.power + "\n" + "BLOOD : " + this.blood + "\n" + live + "\n-----------------\n";
	}

	public void update() {
		if (this.blood <= 0 || this.power <= 0) {
			this.blood = 0;
			this.power = 0;
			this.alive = false;
		}
	}

	public void mushroom() {
		this.blood -= 15;
		this.power -= 2;
		update();
	}

	public void witch(int power) {
		if (this.power <= power) {
			this.blood -= power;
			update();
		} else {
			this.power += 5;
		}
	}

	public void pea() {
		this.blood += 10;
		this.power += 2;
	}

	public void soldier(int power) {
		if (this.power <= power) {
			this.blood -= power;
			update();
		} else {
			this.power += 7;
			this.blood += 5;
		}
	}
}
