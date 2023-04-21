import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int chon, chon1;
		ArrayList<HangHoa> list = new ArrayList<>();
		do {
			System.out.println("1. Nhap thong tin hang hoa");
			System.out.println("2. Hien thi thong tin hang hoa");
			System.out.println("0. Thoat.");
			System.out.println("Moi ban chon : ");
			chon = sc.nextInt();
			switch (chon) {
			case 1: {
				do {
					System.out.println("1.Nhap thong tin hang thuc pham. ");
					System.out.println("2.Nhap thong tin hang sanh su. ");
					System.out.println("3.Nhap thong tin hang dien may. ");
					System.out.println("0.Thoat.");
					System.out.println("Moi ban chon : ");
					chon1 = sc.nextInt();
					switch (chon1) {
					case 1: {
						HangThucPham htp = new HangThucPham();
						htp.Nhap();
						list.add(htp);
						break;
						
					}
					case 2: {
						HangSanhSu hss = new HangSanhSu();
						hss.Nhap();
						list.add(hss);
						break;
					}
					case 3 : {
						HangDienMay hdm = new HangDienMay();
						hdm.Nhap();
						list.add(hdm);
						break;					}
					default:
						break;
					}
				} while (chon1 != 0);
				break;
			}
			case 2:{
				System.out.println("Mang vua nhap la: ");
				for (HangHoa hangHoa : list) {
					System.out.println(hangHoa);
				}
					
			}
			default:
				break;
			}
		} while (chon!=0 );
		

		
	}
}
