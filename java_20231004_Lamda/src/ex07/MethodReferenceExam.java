package ex07;

public class MethodReferenceExam {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.action(new Calcuable() {
			@Override
			public double calc(double x, double y) {
				return x+y;
			}
		});
		person.action((x, y) -> x + y);

		person.action(new Calcuable() {
			@Override
			public double calc(double x, double y) {
				return x + y;
			}
		});

		person.action((x, y) -> Computer.staticMethod(x, y));

		person.action(Double::sum);
		
		person.action(new Calcuable() {
			@Override
			public double calc(double x, double y) {
				return Computer.staticMethod(x, y);
			}
		});
		
		person.action( (x,y) ->
				Computer.staticMethod(x, y) );
		
		person.action(Computer::staticMethod);
			
		Computer com = new Computer();
		person.action(new Calcuable() {
			@Override
			public double calc(double x, double y) {
				return com.instanceMethod(x, y);
			}
		});
		
		person.action((x, y) 
				-> com.instanceMethod(x, y));
		
		person.action(com::instanceMethod);
		
	}
}
