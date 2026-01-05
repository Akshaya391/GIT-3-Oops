import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name:");
    String name = sc.nextLine();
    System.out.print("Enter your age:");
    int age = sc.nextInt();
    System.out.println(":OUTPUT");
    System.out.print("Name: " +name);
    System.out.print("Age:" +age);
    sc.close();
  }
}