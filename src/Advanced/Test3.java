package Advanced;

public class Test3 {


	void add(int no1, int no2)
	{
		System.out.println("Add 1" +(no1+no2));
		
	}
	
	void add(float no1, float no2, float no3)
	{
		System.out.println("Add 2 " +(no1+no2+no3));
	}
	
	void add(String name1, String name2)
	{
		System.out.println("String Add " +name1+" "+name2);
	}
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 T=new Test3();
		T.add(101, 201);
		T.add(100, 200, 300);
		T.add("Indra", "Kurakuri");
	}

}
