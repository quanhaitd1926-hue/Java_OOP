package quanhai19;

public class Staff {
	String name, sex, birth, address, taxID, contract;

	public Staff() {

	}

	public Staff(String name, String sex, String birth, String address, String taxID, String contract) {
		super();
		this.name = name;
		this.sex = sex;
		this.birth = birth;
		this.address = address;
		this.taxID = taxID;
		this.contract = contract;
	}

	public String ChuanHoaName(String s) {
		String[] arr = s.split("\\s+");
		String Name = "";
		for (int i = 0; i < arr.length; i++) {
			Name += Character.toUpperCase(arr[i].charAt(0));
			for (int j = 1; j < arr[i].length(); j++) {
				Name += Character.toLowerCase(arr[i].charAt(j));
			}
			Name += " ";
		}
		return Name.trim();
	}

	public String ChuanHoaBirth(String s) {
		StringBuilder Sb = new StringBuilder(s);
		if (Sb.charAt(1) == '/')
			Sb.insert(0, "0");
		if (Sb.charAt(4) == '/')
			Sb.insert(3, "0");
		return Sb.toString();
	}

	public String toString() {
		return "00001" + " " + ChuanHoaName(this.name) + " " + this.sex + " " + ChuanHoaBirth(this.birth) + " "
				+ this.address + " " + this.taxID + " " + ChuanHoaBirth(this.contract);
	}
}
