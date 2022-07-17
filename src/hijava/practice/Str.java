package hijava.practice;

public class Str {
	public static void main(String[] args){
		
		char c = 'A';
		
		System.out.println(c);
		System.out.println((int)c);
		
		String str = "AB";
		System.out.println(str);
		System.out.println(str.getBytes().length);
		System.out.println("AB".getBytes().length);
		System.out.println("AB한".getBytes().length);
	}
}
