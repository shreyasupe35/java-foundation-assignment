import java.util.Scanner;
class Ass4{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=sc.nextInt();
        if(x>=0){
            System.out.println(x);
            return;
        }
        System.out.println("The number is negative and skipped");
    }
}