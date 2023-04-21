import java.util.Scanner;

public class HangThucPham extends HangHoa{
	protected Ngay NgaySanXuat,NgayHetHan;

	public HangThucPham(String maHang, String tenHang, String nhaSanXuat, double gia, Ngay NgaySanXuat,
			Ngay NgayHetHan) {
		super(maHang, tenHang, nhaSanXuat, gia);
		this.NgaySanXuat = NgaySanXuat;
		this.NgayHetHan = NgayHetHan;
	}
	
	public HangThucPham() {
	}
	
	public Ngay getNgaySanXuat() {
		return NgaySanXuat;
	}

	public void setNgaySanXuat(Ngay NgaySanXuat) {
		this.NgaySanXuat = NgaySanXuat;
	}

	public Ngay getNgayHetHan() {
		return NgayHetHan;
	}

	public void setNgayHetHan(Ngay NgayHetHan) {
		this.NgayHetHan = NgayHetHan;
	}
	Ngay ng1 = new Ngay();
	Ngay ng2 = new Ngay();
	public void Nhap() {
		Scanner sc= new Scanner(System.in);
		super.Nhap();
		System.out.println("Nhap ngay san xuat: ");
		ng1.Nhap();
		System.out.println("Nhap ngay het han: ");
		ng2.Nhap();
		
	}
	public String toString() {
		return "\t\tHangThucPham: \nNgaySanXuat=" + ng1.toString() + " \nNgayHetHan=" + ng2.toString()
				   +"\n"+super.toString();
	}
	

	
}

