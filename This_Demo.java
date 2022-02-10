public class This_Demo {

	String name;
	int roll,age;
	
	
	public This_Demo(String name, int roll, int age) 
	{
		this.name=name;
		this.roll=roll;
		this.age=age;
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_Demo s1= new This_Demo("Akansha",1,29);
		This_Demo s2=new This_Demo("Nora",2, 15);
		
		System.out.println(s1.name+" "+ s1.roll+" "+ s1.age);
		
		System.out.println(s2.name+" "+ s2.roll+" "+ s2.age);
		
	
	}

}