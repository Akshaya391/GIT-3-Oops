// Parent class
class Parent {
    protected int number = 50;   // protected variable

    protected void show() {      // protected method
        System.out.println("Number = " + number);
    }
}

// Child class with main method
public class Main extends Parent {
    public static void main(String[] args) {

        Main obj = new Main();

        // accessing protected members through inheritance
        obj.show();
    }
}
