import java.util.Scanner;
class ass{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the name");
    String name =sc.nextLine();
    System.out.println("enter the field of interesT");
    String field=sc.nextLine();
    System.out.println("enter the rollnumber");
    int rollno=sc.nextInt();
    
    System.out.println();
    System.out.println("Name:"+name);
    System.out.println("Roll Number:"+rollno);
    System.out.println("Field of Interest:"+field);

  }
}