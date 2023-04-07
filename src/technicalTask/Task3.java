package technicalTask;

//3. Program for Method Overriding
class Bank{
	double getintersetRate(){
		return 0;
	}
}

class SBI extends Bank{
	double getintersetRate(){
		return 10.55;
	}
}

class ICIC extends Bank{
	double getintersetRate(){
		return 12.55;
	}
}
public class Task3 {

	public static void main(String[] args) {
	
		SBI s= new SBI();
		System.out.println(s.getintersetRate());
		
		ICIC i=new ICIC();
		System.out.println(i.getintersetRate());
		

	}

}
