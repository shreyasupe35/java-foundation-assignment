import java.util.Scanner;
class Ass3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost price ");
        int x=sc.nextInt();
        System.out.println("Enter the selling price");
        int y=sc.nextInt();
        System.out.println("Profit:"+(y-x));
        
    }
}