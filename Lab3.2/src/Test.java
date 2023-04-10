import javax.swing.text.html.parser.DTD;

public class Test {
public static void main(String[] args) {
	System.out.println("========TAM GIAC==========");
	TamGiac tg= new TamGiac(0, 0);
	tg.nhapTG();
	tg.inTG();
	System.out.println("Co phai la tam giac khong: "+tg.kiemTra());
	System.out.println("==>Chu vi :"+tg.chuVi());
	System.out.println("==>Dien tich :"+tg.dienTich());
	System.out.println("========DUONG TRON========");
	DuongTron dt= new DuongTron(0, 0, 0);
	dt.nhapDT();
	System.out.println("==>Chu vi duong tron: "+dt.chuViDT());
	System.out.println("==>Dien tich duong tron: "+dt.dienTichDT());
}
}
