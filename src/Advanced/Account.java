package Advanced;

public class Account {

	int accountno;
	String name;
	int amount;
	int newamt;
	
		void input(int num, int amt, String nm, int namt)
		{
		accountno=num;
		amount=amt;
		name=nm;
		newamt=namt;
		
		System.out.println("Total Balance is "+ (amt+namt));
		}
		
		void withdraw(int c, int d)
		{
		
			amount=c;
			newamt=d;
			System.out.println("Balance" +(c-d));
		}	
		
			
			public static void main(String[] args) {
		// TODO Auto-generated method stub
				Account A=new Account();
				A.input(101, 5,"indra", 100);
				A.withdraw(101, 105);
				
	}

}
