package loop;

public class prog6 {
 public static void main(String args[]) {
	 int n=6;
	  char A=65;
	 for(int i=1;i<n;i++) {
		 for(int k=1;k<=n-i;k++) System.out.print(" ");
		 for(int j=1;j<=2*i-1;j++) {
			 System.out.print(A++);
			 
		 }
		 A=65;
		 System.out.println();
	 }
	 for(int i=n;i>=1;i--) {
		 for(int k=1;k<=n-i;k++) System.out.print(" ");
		 for(int j=1;j<=2*i-1;j++) {
			 System.out.print(A++);
			 
		 }
		 A=65;
		 System.out.println();
	 }
 }
}
