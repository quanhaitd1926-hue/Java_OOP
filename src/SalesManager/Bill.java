package SalesManager;

public class Bill {
	private String idBill, idCus, idItem, quantity;
	private Customer cus;
	private Items item;

	public Bill(String idBill, String idCus, String idItem, String quantity) {
		this.idBill = idBill;
		this.idCus = idCus;
		this.idItem = idItem;
		this.quantity = quantity;
	}

	public String getIdBill() {
		return idBill;
	}

	public void setIdBill(String idBill) {
		this.idBill = idBill;
	}

	public String getIdCus() {
		return idCus;
	}

	public void setIdCus(String idCus) {
		this.idCus = idCus;
	}

	public String getIdItem() {
		return idItem;
	}

	public void setIdItem(String idItem) {
		this.idItem = idItem;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		return cus.getNameCus() + " " + cus.getAddress() + " " + item.getNameItem() + " " + item.getUnit();
	}
}
