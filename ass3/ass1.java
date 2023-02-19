import java .util.Scanner;
class ass1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=((x+8)/3)%5*5;
        System.out.println(y);
    }
}