package day02_variable;

public class Quiz01 {

	public static void main(String[] args) {
		byte b=97;
		short s=20;
		char c='A';
		float f;
		
		s=(short)b;
		c=(char)b;
		s=(short)c;
		c=(char)s;
		f=(float) 5.11;
		
	}
}
