import java.util.Scanner;

class ass3{
    public static void main(String args[]){
        int[] arr=new int[3];
        float sum =0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks");
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];

        }
        System.out.println("Total Marks:"+(int)sum);
        System.out.println("Percentage marks:"+(int)(sum/300*100)+"%");
    }
}
