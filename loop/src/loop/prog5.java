package loop;

public class prog5 {
public static void amian(String args[]) {
	int n=5;
	for(int i=1;i<=(n+1)/2;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=n;k++) {
			if(k==(i-1)||k==n-i)
				System.out.print("*");
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
