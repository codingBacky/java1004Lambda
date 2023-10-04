package ex03;


interface Printable{
	void print();
}

class Papers{
	private String con;
	
	public Papers(String con) { this.con=con; }
	
	public Printable getPrinter() {
		
		return new Printable() {//익명 클래스 -> 이렇게 더 많이 사용
			
			@Override
			public void print() {
				System.out.println(con);
			}
		};
	}

}

public class UseLocalInnerClass {
	
	public static void main(String[] args) {
		Papers p = new Papers("프린터로 메시지 출력");

		Printable prn = p.getPrinter();
		prn.print();// 내부에서 어떻게 동작하는지 상관없음 출력만 되면 돼^^

	}

}
