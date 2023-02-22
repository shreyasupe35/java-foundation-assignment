import java.util.Scanner;
class Ass5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the operator");

        char ch=sc.next().charAt(0);
        System.out.println("enter the two numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        switch(ch){
            case '+':System.out.println(x+y);
                     break;
            case '-':System.out.println(x-y);
            break;
            case '*':System.out.println(x*y);
            break;
            case '/':
            try{
                System.out.println(x/y);
                break;
            }catch(ArithmeticException e){
                System.out.println("error division by zero is not possible");
            }        

        }
    }
}