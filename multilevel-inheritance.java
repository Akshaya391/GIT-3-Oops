class Animal {
    void eat() {
        System.out.println("eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking");
    }
}

public class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping");
    }

    public static void main(String[] args) {
        BabyDog d1 = new BabyDog();
        d1.eat();
        d1.bark();
        d1.weep();
    }
}
