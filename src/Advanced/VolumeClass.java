package Advanced;

public class VolumeClass {
	
	int radius;
	int height;
	float length;
	
 void vol(int r, int h, float l)
 {
	 this.radius=r;
	 this.height=h;
	 this.length=l;
	 
	 System.out.println(length*length*length);
	
 }
 
 void display(int radius, int height)
 {
	 this.radius=radius;
	 this.height=height;
	 System.out.println(3.142*height*radius);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VolumeClass V=new VolumeClass();
		V.vol(10, 10, 20);
		V.display(20, 20);
	}

}
