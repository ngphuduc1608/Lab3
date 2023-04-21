import java.util.Scanner;

public class HangSanhSu extends HangHoa{
	protected String loaiNguyenLieu;

	public HangSanhSu(String maHang, String tenHang, String nhaSanXuat, double gia, String loaiNguyenLieu) {
		this.loaiNguyenLieu = loaiNguyenLieu;
	}

	public HangSanhSu() {
	}

	public String getLoaiNguyenLieu() {
		return loaiNguyenLieu;
	}

	public void setLoaiNguyenLieu(String loaiNguyenLieu) {
		this.loaiNguyenLieu = loaiNguyenLieu;
	}
	public void Nhap() {
		super.Nhap();
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap loai nguyen lieu: ");
		loaiNguyenLieu=sc.nextLine();
	}

	@Override
	public String toString() {
		
		return "\t\tHangSanhSu \nloaiNguyenLieu=" + loaiNguyenLieu +"\n"+super.toString();
	}
	
	
}
