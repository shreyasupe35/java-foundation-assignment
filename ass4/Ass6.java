import java.util.*;
class Ass6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks");
        int x=sc.nextInt();
        if(x>90 && x<100){
            System.out.println("A+");

        }
        else if(x>80 && x<90){
            System.out.println("A");
        }
        else if(x>70 && x<80){
             System.out.println("B+");
        }
        else if(x>60 && x<70){
             System.out.println("B");
        }
        else if(x>50 && x<60){
             System.out.println("C");
        }else if(x>40 && x<50){
             System.out.println("D");
        }
        else if(x>30 && x<40){
             System.out.println("E");
        }
        else if(x>0 && x<30){
             System.out.println("F");
        }
    }
}