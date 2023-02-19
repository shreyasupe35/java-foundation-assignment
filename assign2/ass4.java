import java.util.Scanner;
class ass4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of test cases");
        
        int t=sc.nextInt();
        int[][] arr=new int[t][2];
        for(int i=0;i<t;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();

            }


        }
        for(int i=0;i<t;i++){
            
               System.out.println(arr[i][0]+arr[i][1]);

            


        }
        
    }
}