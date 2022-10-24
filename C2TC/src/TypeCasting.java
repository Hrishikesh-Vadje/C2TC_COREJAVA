
public class TypeCasting {
	
		
	public static void main(String[] args) {
		//Widening- Converting smaller type size to a larger type size. Done Automatically.
		int a=10;
		double b= a;
		System.out.println(b);
		System.out.println(a);
		
		
		//Narrowing- Converting larger type size to a smaller type size. Need to be done manually.
		// we use type cast operator.
		double c=12.3;
		int d=(int)c;
		System.out.println(d);
		System.out.println(c);
		
		
	}

}
