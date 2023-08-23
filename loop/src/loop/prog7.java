package loop;

public class prog7 {
public static void amin(String args[]) {
	int n=7;
	for(int i=1;i<n;i++) {
		for(int j=1;j<n;j++) {
			if(j==Math.ceil(n/2)|| i==Math.ceil(n/2)) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
