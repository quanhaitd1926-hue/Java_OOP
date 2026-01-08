package OOP;

public class SinhVienIT extends SinhVien {
	private double scoreJava, scoreHTML;

	public double getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(double scoreJava) {
		this.scoreJava = scoreJava;
	}

	public double getScoreHTML() {
		return scoreHTML;
	}

	public void setScoreHTML(double scoreHTML) {
		this.scoreHTML = scoreHTML;
	}

	public SinhVienIT(double scoreJava, double scoreHTML) {
		super();
		this.scoreJava = scoreJava;
		this.scoreHTML = scoreHTML;
	}

	@Override
	double getDiem() {
		return (this.scoreJava * 2 + this.scoreHTML) / 3;
	}

}
