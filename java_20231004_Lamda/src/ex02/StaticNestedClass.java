package ex02;


class Outer{
	private static int num = 0;//멤버변수
	
	static class Nested1{
		void add(int n) { num += n; }//지역변수
	}
	
	static class Nested2{
		int get() { return num; }
	}
}
public class StaticNestedClass {
	
	public static void main(String[] args) {
		
	}

}
