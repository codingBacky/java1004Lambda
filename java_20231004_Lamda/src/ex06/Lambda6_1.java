package ex06;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

//void printVal(String name);
//System.out.println(name);

//int square(int x);
//int add(int x, int y)
//int sub(int x, int y)
public class Lambda6_1 {
	public static void main(String[] args) {
		Consumer<String> con = name -> System.out.println(name);
		
		Consumer<String> con1 = new Consumer<String>() {
			
			@Override
			public void accept(String name) {
				System.out.println(name);
			}
		};
		
		con.accept("lalla");
		
		BiConsumer<String, Integer> bicon = 
											(name, age) -> System.out.println(name + "=" +age);
											
		bicon.accept("lullu", 20);
		
		BiFunction<Integer, Integer, Double> bif1 = (x,y) -> (double)(x+y) ;//(x+y)*2.0 실수 변환
		System.out.println(bif1.apply(10, 10));
		
		BiFunction<Integer, Integer, Integer> bif2 = (x,y) -> x-y;
		System.out.println(bif2.apply(10, 10));
		
		}	
}

