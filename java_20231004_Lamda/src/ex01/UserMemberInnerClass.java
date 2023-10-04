package ex01;

interface Printable{
	void print();
}

class Papers{
	private String con;
	
	public Papers(String con) { this.con=con; }
	
	public Printable getPrinter() {
		return new Printer();
	}
	
	private class Printer implements Printable{
		
		@Override
		public void print() {
			System.out.println(con);
		}
	}
	
	private class Printer2 implements Printable{
		
		@Override
		public void print() {
			System.out.println(con);
		}
	}
}

public class UserMemberInnerClass {
	public static void main(String[] args) {
		Papers p = new Papers("프린터로 메시지 출력");
		
		Printable prn = p.getPrinter();
		prn.print();//내부에서 어떻게 동작하는지 상관없음 출력만 되면 돼^^
	}
}
