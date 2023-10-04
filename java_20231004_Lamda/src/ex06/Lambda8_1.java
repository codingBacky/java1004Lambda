package ex06;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

interface Ddd{
	int roll();
}

class Dddd implements Ddd{
	@Override
	public int roll() {
		return (int)(Math.random()*6);
	}
}

public class Lambda8_1 {
	public static void main(String[] args) throws Exception {
		
		Ddd dd = () -> (int)(Math.random()*6);
		System.out.println(dd.roll());
			
	
		Supplier<Integer> supplier = () -> (int)(Math.random()*6);
		System.out.println(supplier.get());
	
		Callable<Integer> callable = () -> (int)(Math.random()*6);
		System.out.println(callable.call());
		
		Supplier<Integer> s1 = new Supplier<Integer>() {
			
			@Override
			public Integer get() {
				return (int)(Math.random()*6);
			}
		};
		System.out.println(s1.get());
	}
}

