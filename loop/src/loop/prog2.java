package loop;

import java.util.Scanner;

public class prog2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n=sc.nextInt();
		int i=0;
		while(i<n) {
			int x=sc.nextInt();
			
			if(x<0) {
				sum=-1;
				break;
			}
			else {
				 sum+=x;
			}
			i++;
			
		}
		System.out.println(sum);
		}
		
	}


