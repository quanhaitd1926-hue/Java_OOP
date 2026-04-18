package Enum;

public enum OrderStatus {
	PENDING("Chờ xác nhận"), SHIPPED("Đang giao hàng"), DELIVERED("Đã giao"), CANCELLED("Đã hủy");

	private final String status;

	private OrderStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public boolean hasFinal() {
		if (this == DELIVERED || this == CANCELLED)
			return true;
		return false;
	}

}
