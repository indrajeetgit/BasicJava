package Advanced;

class A{
	int numb1;
	int numb2;

	void display(int a , int b){
		numb1=a;
		numb2=b;
		System.out.println(a+b);
	}

	void mul(int a , int b){
		numb1=a;
		numb2=b;
		System.out.println(a*b);
	}
	void div(int a, int b) {
		System.out.println(a/b);
	}
}

public class Test2 {

	public static void main(String[] args) {
		A sc1 = new A();
		sc1.display(3, 5);
		sc1.mul(3, 4);
		sc1.div(15, 5);
	}

}
