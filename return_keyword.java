public class Store
{
  int paste(int money)
{
  int paste_price = 75;
  int rem = 100-75;
  return(rem);
}
public static void main(String[] args)
{
  Store obj1 = new Store();
  int remainder = obj1.paste(100);
  System.out.println(remainder);
}
}