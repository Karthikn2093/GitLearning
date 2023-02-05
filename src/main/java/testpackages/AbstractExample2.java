package testpackages;

public class AbstractExample2 extends AbstractExample{

	public static void main(String[] args) {
	
		AbstractExample2 obj = new AbstractExample2();
		obj.method1();
		obj.method2();

	}

	@Override
	public void method1() {
		
		System.out.println("Method1");
		
	}

}
