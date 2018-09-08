import java.util.Scanner;

class Demo{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a value: ");
    int a = s.nextInt();
    System.out.print("Enter b value: ");
    int b = s.nextInt();
    if(a>b){
      System.out.println("a is bigger than b");
    }else{
      System.out.println("b is bigger than a");
    }
  }
}
