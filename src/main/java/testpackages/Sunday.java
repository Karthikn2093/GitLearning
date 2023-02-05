package testpackages;

public class Sunday implements InterfaceTest {
	
	public void method1() {
		System.out.println("Method1");
	}

	public static void main(String[] args) {
		
		Sunday obj = new Sunday();
		obj.method1();
		obj.method2();
		obj.method3();

	}

	public void method2() {
		
		System.out.println("Method2");
		
	}

	public void method3() {
		
		System.out.println("Method3");
	}

}
