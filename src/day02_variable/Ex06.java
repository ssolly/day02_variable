package day02_variable;

import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) throws IOException {
		
		// # System in read : ���� �ϳ��� �Է� �޴� ���
		
		int val;
		System.out.print("1 �Է� : ");
		val = System.in.read();
		System.out.println("1 �Է� data : " + val);
		System.out.println("1 �Է� data : " + (char)val);
		
		System.out.print("2 �Է� : ");
		val = System.in.read();
		System.out.println("2 �Է� data : " + (char)val);
		
		System.out.print("3 �Է� : ");
		val = System.in.read();
		System.out.println("3 �Է� data : " + (char)val);
	}
}
