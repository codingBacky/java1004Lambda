package ex06;

import java.util.function.Function;

public class Lambda7_1 {
	public static void main(String[] args) {
		
		Function<Integer, Integer> f = x -> x * x;
		System.out.println(f.apply(5));
	
	
	
		Function<String, Integer> f1 = s ->Integer.parseInt(s);
		System.out.println(f1.apply("100"));
		Function<String, Integer> f2 = Integer::parseInt;
		System.out.println(f2.apply("100"));
}
}

