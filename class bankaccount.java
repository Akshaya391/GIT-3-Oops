// Accessing members of the class

class bankaccount
{
    int balance = 50000;
void showbalance()
{
    System.out.println("Balance=" + balance);
}
public static void main (String[]args)
{
    bankaccount b = new bankaccount();
    System.out.println(b.balance);
    b.showbalance();
    
}
}