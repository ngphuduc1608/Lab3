import java.util.Scanner;

public class HangHoa {
	protected String maHang,tenHang,nhaSanXuat;
	protected double gia;
	public HangHoa(String maHang, String tenHang, String nhaSanXuat, double gia) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.nhaSanXuat = nhaSanXuat;
		this.gia = gia;
	}
	public HangHoa() {
	}
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public void Nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap ma hang: ");
		this.maHang=sc.nextLine();
		System.out.println("Nhap ten hang: ");
		this.tenHang=sc.nextLine();
		System.out.println("Nhap nha san xuat: ");
		this.nhaSanXuat=sc.nextLine();
		System.out.println("Nhap gia: ");
		this.gia=sc.nextDouble();
	}
	@Override
	public String toString() {
		return "maHang=" + maHang + " \ntenHang=" + tenHang + "\nnhaSanXuat=" + nhaSanXuat + "\ngia=" + gia;
	}
	
	
	
	
}
