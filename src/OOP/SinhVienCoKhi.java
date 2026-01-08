package OOP;

public class SinhVienCoKhi extends SinhVien {
	private double scoreCNC, scorePLC;

	public double getScoreCNC() {
		return scoreCNC;
	}

	public void setScoreCNC(double scoreCNC) {
		this.scoreCNC = scoreCNC;
	}

	public double getScorePLC() {
		return scorePLC;
	}

	public void setScorePLC(double scorePLC) {
		this.scorePLC = scorePLC;
	}

	public SinhVienCoKhi(double scoreCNC, double scorePLC) {
		super();
		this.scoreCNC = scoreCNC;
		this.scorePLC = scorePLC;
	}

	@Override
	double getDiem() {
		return (this.scoreCNC + this.scorePLC) / 2;
	}

}
