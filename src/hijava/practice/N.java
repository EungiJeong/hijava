package hijava.practice;

public class N {
	
	//git applied? (test)
	int x = 10;
	int y = 20;
	
	public void swap() {
		int temp = x;
		x = y;
		y = temp;
	}
	
	public static void main(String[] args) {
		N n = new N();
		
		System.out.println("x = " + n.x);
		System.out.println("y = " + n.y);
		
		n.swap();
		
		System.out.println("x = " + n.x);
		System.out.println("y = " + n.y);
	}

}
