package day02_variable;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		String name;
		int kor,eng,math,sum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �̸��� �����Դϱ�? ");
		name=sc.next();
		System.out.print(name+"���� ���� ���� : ");
		kor=sc.nextInt();
		System.out.print(name+ "���� ���� ���� : ");
		eng=sc.nextInt();
		System.out.print(name+ "���� ���� ���� : ");
		math=sc.nextInt();
				
		sum=kor+eng+math;
		
		System.out.println("\n===============");
		System.out.println(" �̸� : "+name);
		System.out.println("===============");
		System.out.println(" ���� : " + kor);
		System.out.println(" ���� : " + eng);
		System.out.println(" ���� : " + math);
		System.out.println("===============");
		System.out.println(" �հ� : " + sum);
		System.out.println("===============");
	}
}
