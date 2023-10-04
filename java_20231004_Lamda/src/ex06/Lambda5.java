package ex06;

@FunctionalInterface // 암시적으로 람다를 쓰겠다는 의미. 추상메서드가 하나여야함

//함수형 인터페이스들 >>
interface Cal2 {
	int max(int num1, int num2);
}
interface Cal3{
	void printVar(String name, int i);
}
interface Cal4{
	int square(int x);
}
interface Cal5{
	int roll();
}
interface Cal6{
	int sumArr(int[] arr);
}
/*
class Cal06 implements Cal6{

	@Override
	public int sumArr(int[] arr) {
		int sum = 0;
		for(int i : arr) 
			sum += i;
		return sum;
	}
	
}
*/
public class Lambda5 {
	public static void main(String[] args) {
		Cal2 cal = //중괄호를 넣을거면 return도 써줘야함 
				//추상 메서드가 1개만 존재해야 한다.
				(num1, num2) -> num1 > num2 ? num1 : num2;
				
		Cal3 cal3 = 
				(name, i) -> System.out.println(name + "=" + i);
				
		Cal4 cal4 = 
				x -> x * x;
		Cal5 cal5 = 
				() -> (int)(Math.random()*6);
				
		Cal6 cal6 =
				arr ->  {int sum = 0; for(int i : arr) sum += i; return sum;};
		
		/*
		Cal6 cal06 = new Cal6() {

			@Override
			public int sumArr(int[] arr) {
				int sum = 0;
				for(int i : arr) 
					sum += i;
				return sum;
			}
		};
		*/
		
		System.out.println(cal.max(5, 10));
		cal3.printVar("출력", 10);
		System.out.println(cal4.square(10));
		System.out.println(cal5.roll());
		System.out.println(cal6.sumArr(new int[] {1,2,3,4,5}));
		
		
		}	
}

