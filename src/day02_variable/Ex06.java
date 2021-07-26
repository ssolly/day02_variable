package day02_variable;

import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) throws IOException {
		
		// # System in read : 문자 하나를 입력 받는 기능
		
		int val;
		System.out.print("1 입력 : ");
		val = System.in.read();
		System.out.println("1 입력 data : " + val);
		System.out.println("1 입력 data : " + (char)val);
		
		System.out.print("2 입력 : ");
		val = System.in.read();
		System.out.println("2 입력 data : " + (char)val);
		
		System.out.print("3 입력 : ");
		val = System.in.read();
		System.out.println("3 입력 data : " + (char)val);
	}
}
