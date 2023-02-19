import java.util.Scanner;
class Ass5{
    static int cdtb(int a){
        int ans=0;
        int pw=1;
        while(a>0){
            int unitdigit=a%2;
            ans+=(unitdigit*pw);
       
           pw*=10;
            a= a/2;

        }
        return ans;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int ans1=cdtb(x);
         int ans2=cdtb(y);
         int count=0;
         System.out.println(ans1);
         System.out.println(ans2);
        while(ans1!=0 || ans2!=0){
            x=ans1%10;
            ans1=ans1/10;
             y=ans2%10;
            ans2=ans2/10;
            if((x^y)==1){
                count++;
            }
        }
        System.out.println(count);



    }

}