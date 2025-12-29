class vehicle 
{
    void bike() 
    {
        System.out.println("running");
    }
}

class car extends vehicle
{
    void speed() 
    {
        System.out.println("speed at 80km");
    }

    public static void main(String[] args) 
    {
        car c1 = new car();
        c1.bike();   
        c1.speed();  
    }
}
