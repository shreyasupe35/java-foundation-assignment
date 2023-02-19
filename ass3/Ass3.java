import java.util.Scanner;
class Ass3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int sum=0;
        while(x!=0){
            int y=x%10;
            sum+=y;
            x=x/10;

        }
        System.out.println(sum);
    }
}