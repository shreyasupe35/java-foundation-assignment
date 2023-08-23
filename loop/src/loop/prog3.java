package loop;

import java.util.Scanner;

public class prog3 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int fact=1;
	int n=sc.nextInt();
	if(n==0) { 
		fact=0 ;
		
	}
	for(int i=1;i<=n;i++) {
		fact*=i;
	}
	System.out.println(fact);
}
}
