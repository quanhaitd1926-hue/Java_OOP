package OOP;

public class Main {
	public static void main(String[] args) {
		SinhVien it1 = new SinhVienIT(10, 9);
		System.out.println("sinh vien it score = " + it1.getDiem());
		SinhVien ck1 = new SinhVienCoKhi(10, 9);
		System.out.println("sinh vien ck score = " + ck1.getDiem());
	}
}
