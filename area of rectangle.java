// Area of rectangle using class and object

class Rectangle {
    
    int length = 5;
    int width = 4;

    void area() {
        System.out.println("Area = " + (length * width));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
    }
}
