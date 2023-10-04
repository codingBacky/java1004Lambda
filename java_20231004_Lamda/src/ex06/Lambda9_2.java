package ex06;

import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda9_2 {
	public static void main(String[] args) throws Exception {
		
		Predicate<Integer> p1 = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				return t%2 == 0;
			}
		};
		int num = (int)(Math.random()*100);
		boolean flag = p1.test(num);
		String msg = flag == true ? "짝수" :"홀수";
		System.out.println(num + "는(은) " + msg + " 입니다");
		
		
		
		Predicate<Integer> p = x -> x%2 == 0 ;//boolean
		
		System.out.println("짝수인가요?" + p.test(5));
		
		Function<Integer, String> f = x -> x%2 == 0 ? "짝수입니다" : "홀수입니다" ;
		
		System.out.println(f.apply(99));
	}
}

