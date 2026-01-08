package SalesManager;

public class Items {
	private String idItem, nameItem, unit;
	private int purchasePrice, sellingPrice;

	public Items() {

	}

	public Items(int idItem, String nameItem, String unit, int purchasePrice, int sellingPrice) {
		this.idItem = "MH" + String.format("%03d", idItem);
		this.nameItem = nameItem;
		this.unit = unit;
		this.purchasePrice = purchasePrice;
		this.sellingPrice = sellingPrice;
	}

	public String getIdItem() {
		return idItem;
	}

	public void setIdItem(String idItem) {
		this.idItem = idItem;
	}

	public String getNameItem() {
		return nameItem;
	}

	public void setNameItem(String nameItem) {
		this.nameItem = nameItem;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public int getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public int getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
}
