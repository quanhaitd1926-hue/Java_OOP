package J05036_CaculationSellingPrice;

public class DepartmentStore {
	private String idItem, nameItem, unit;
	private double purchasePrice;
	private int quantity;

	public DepartmentStore(int idItem, String nameItem, String unit, double purchasePrice, int quantity) {
		super();
		this.idItem = "MH" + String.format("%02d", idItem);
		this.nameItem = nameItem;
		this.unit = unit;
		this.purchasePrice = purchasePrice;
		this.quantity = quantity;
	}

	public long getShipingFee() {
		return Math.round((double) this.purchasePrice * this.quantity * 0.05);
	}

	public long getMoney() {
		return Math.round(this.purchasePrice * this.quantity + getShipingFee());
	}

	public long getSellingPrice() {
		return (long) Math.ceil(((getMoney() + getMoney() * 0.02) / quantity) / 100.0) * 100;
	}

//	public long getSellingPrice() {
//		return Math.round(getMoney() + getMoney() * 0.02);
//	}

	@Override
	public String toString() {
		return this.idItem + " " + this.nameItem + " " + this.unit + " " + getShipingFee() + " " + getMoney() + " "
				+ getSellingPrice();
	}
}
