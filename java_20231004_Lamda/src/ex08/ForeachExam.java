package ex08;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForeachExam {

	public static void main(String[] args) {
		List<String> lists = Arrays.asList("Box","Toy","Robot","Toy","Box");
		
		for(String list : lists)
			System.out.println(list);
		
		lists.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
			}
		});
		
		lists.forEach(s -> System.out.println(s));
		lists.forEach(System.out::println);//class 이름, static 명::메서드 명
	}

}
