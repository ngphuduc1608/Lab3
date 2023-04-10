import java.util.Scanner;

public class TamGiac extends Diem {
	protected Diem A,B,C;
	protected double AB,BC, AC, P,S,p;
	TamGiac(int x, int y) {
		super(x,y);
		A = new Diem(0,0);
		B = new Diem(0,0);
		C = new Diem(0,0);
	}

	public void nhapTG() {
		System.out.println("*Nhap diem A: ");
		A.nhapDiem();
		System.out.println("*Nhap diem B: ");
		B.nhapDiem();
		System.out.println("*Nhap diem C: ");
		C.nhapDiem();
	}
	public void inTG() {
		System.out.print("Diem A: ");
		A.inDiem();
		System.out.print("Diem B: ");
		B.inDiem();
		System.out.print("Diem C: ");
		C.inDiem();
	}
	public boolean kiemTra() {
		float AB,BC,AC;
		AB=(float)Math.sqrt(Math.pow(B.x-A.x, 2)+Math.pow(B.y-A.y, 2));
		BC=(float)Math.sqrt(Math.pow(C.x-B.x, 2)+Math.pow(C.y-B.y, 2));
		AC=(float)Math.sqrt(Math.pow(C.x-A.x, 2)+Math.pow(C.y-A.y, 2));
		System.out.println("AB = "+AB);
		System.out.println("BC = "+BC);
		System.out.println("AC = "+AC);
		return AB+BC>AC && AB+AC>BC && AC+BC>AB;
	}
	public double chuVi() {
		float AB,BC,AC;
		AB=(float)Math.sqrt(Math.pow(B.x-A.x, 2)+Math.pow(B.y-A.y, 2));
		BC=(float)Math.sqrt(Math.pow(C.x-B.x, 2)+Math.pow(C.y-B.y, 2));
		AC=(float)Math.sqrt(Math.pow(C.x-A.x, 2)+Math.pow(C.y-A.y, 2));
		return (AB+AC+BC);
	}
	public double dienTich() {
		float AB,BC,AC,p;
		AB=(float)Math.sqrt(Math.pow(B.x-A.x, 2)+Math.pow(B.y-A.y, 2));
		BC=(float)Math.sqrt(Math.pow(C.x-B.x, 2)+Math.pow(C.y-B.y, 2));
		AC=(float)Math.sqrt(Math.pow(C.x-A.x, 2)+Math.pow(C.y-A.y, 2));
		p=(AB+AC+BC)/2;
		return Math.sqrt(p*(p-AB)*(p-AC)*(p-BC));
	}

}
