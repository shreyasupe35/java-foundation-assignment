package loop;

import java.util.Scanner;

public class prob1 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int fib=1;
	int prev=1;
	for(int i=1;i<=n;i++) {
		System.out.println(fib);
		int sum=prev+fib;
		fib=prev;
		prev=sum;
		
	
	}
}
}
