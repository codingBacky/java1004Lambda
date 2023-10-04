package ex02;


interface Printable{
	void print();
}

class Papers{
	private String con;
	
	public Papers(String con) { this.con=con; }
	//여기서 new Printer로 생성할 수 없음 
	public Printable getPrinter() {
		// 메서드 안에서만 사용가능한 Inner class
		class Printer implements Printable {

			@Override
			public void print() {
				System.out.println(con);
			}
		}
		return new Printer();
	}

}

public class UseLocalInnerClass {
	
	public static void main(String[] args) {
		Papers p = new Papers("프린터로 메시지 출력");

		Printable prn = p.getPrinter();
		prn.print();// 내부에서 어떻게 동작하는지 상관없음 출력만 되면 돼^^

	}

}
