package ex06;

import java.util.function.Function;

interface Eee{
	int sumArr(int[] arr);
}

class Eeee implements Eee{
	@Override
	public int sumArr(int[] arr) {
		int sum = 0;
		for(int i : arr) 
			sum += i;
		return sum;
	}
}

public class Lambda9_1 {
	public static void main(String[] args) throws Exception {
		
		Eee ee = 
				arr -> {int sum = 0; for(int i : arr) sum += i; return sum;};
		
		Function<Integer[], Integer> f = 
				arr -> {int sum = 0; for(int i : arr) sum += i; return sum;};
				
		System.out.println(f.apply(new Integer[] {1,2,3,4,5}));
	}
}

