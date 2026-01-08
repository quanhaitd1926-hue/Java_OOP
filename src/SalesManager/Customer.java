package SalesManager;

public class Customer {
	private String idCus, nameCus, gender, birth, address;

	public Customer() {

	}

	public Customer(int idCus, String nameCus, String gender, String birth, String address) {
		this.idCus = "KH" + String.format("%03d", idCus);
		this.nameCus = nameCus;
		this.gender = gender;
		this.birth = birth;
		this.address = address;
	}

	public String getIdCus() {
		return idCus;
	}

	public void setIdCus(String idCus) {
		this.idCus = idCus;
	}

	public String getNameCus() {
		return nameCus;
	}

	public void setNameCus(String nameCus) {
		this.nameCus = nameCus;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
