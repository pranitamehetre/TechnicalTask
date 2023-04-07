package technicalTask;

//1.Method Overloading By changing a number of argument
public class Task1 {
	
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	int add(int a, int b, int c, int d) {
		return a+b+c+d;
	}

	public static void main(String[] args) {
		Task1 AD= new Task1();
		System.out.println(AD.add(10, 20));
		System.out.println(AD.add(10, 20,30));
		System.out.println(AD.add(10, 20,30,40));

	}

}
