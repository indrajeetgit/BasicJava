package Advanced;

public class RectangleConstructor {

		int length;
		int breadth;
		int area;
	
		public RectangleConstructor(int length, int breadth)
		{
			// TODO Auto-generated constructor stub
			
			this.length=length;
			this.breadth=breadth;
//			this.area=area;
//			area=length*breadth;
	}
			void area()
			{
			System.out.println("Rectangle "+(length*breadth));
			}
			void perimeter()
			{
			System.out.println("Perimeter "+ 2*(length*breadth));
			}
			
			void both()
			{
				this.area();
				this.perimeter();
			}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleConstructor R=new RectangleConstructor(10, 20);
		R.both();

	}

}
