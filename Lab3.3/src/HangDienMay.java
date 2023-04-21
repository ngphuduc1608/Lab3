import java.util.Scanner;

public class HangDienMay extends HangHoa{
	protected Double thoiGianBaoHanh,dienAp,congSuat;

	public HangDienMay(Double thoiGianBaoHanh, Double dienAp, Double congSuat) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.dienAp = dienAp;
		this.congSuat = congSuat;
	}

	public HangDienMay() {
	}

	public Double getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(Double thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public Double getDienAp() {
		return dienAp;
	}

	public void setDienAp(Double dienAp) {
		this.dienAp = dienAp;
	}

	public Double getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(Double congSuat) {
		this.congSuat = congSuat;
	}
	public void Nhap() {
		Scanner sc= new Scanner(System.in);
		super.Nhap();
		System.out.println("Nhap thoi gian bao hanh: ");
		thoiGianBaoHanh=sc.nextDouble();
		System.out.println("Nhap dien ap: ");
		dienAp=sc.nextDouble();
		System.out.println("Nhap cong suat: ");
		congSuat=sc.nextDouble();
	}

	@Override
	public String toString() {
		return "\t\tHangDienMay \nthoiGianBaoHanh=" + thoiGianBaoHanh + " \ndienAp=" + dienAp + "\ncongSuat=" + congSuat+"\n"+super.toString();
	}

	
	
	
}
