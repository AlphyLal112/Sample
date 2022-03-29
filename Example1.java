package Exception;

public class Example1 {
public void validateAge(int age) throws InterruptedException{
	if(age>=18) {
		System.out.println("Eligible");
		Thread.sleep(10000);
		System.out.println("Welcome");
	}
	else {
		throw new ArithmeticException("Not Eligible, Age less than 18");
		
	}
}
public static void main(String args[]) throws InterruptedException{
	Example1 e=new Example1();
	try {
		e.validateAge(17);
	}
	catch(ArithmeticException a) {
		System.out.println(a.getLocalizedMessage());
	}
}
}
