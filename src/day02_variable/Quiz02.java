package day02_variable;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		String name;
		int kor,eng,math,sum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까? ");
		name=sc.next();
		System.out.print(name+"님의 국어 점수 : ");
		kor=sc.nextInt();
		System.out.print(name+ "님의 영어 점수 : ");
		eng=sc.nextInt();
		System.out.print(name+ "님의 수학 점수 : ");
		math=sc.nextInt();
				
		sum=kor+eng+math;
		
		System.out.println("\n===============");
		System.out.println(" 이름 : "+name);
		System.out.println("===============");
		System.out.println(" 국어 : " + kor);
		System.out.println(" 영어 : " + eng);
		System.out.println(" 수학 : " + math);
		System.out.println("===============");
		System.out.println(" 합계 : " + sum);
		System.out.println("===============");
	}
}
