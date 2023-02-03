
class Animal{
    void run(){
        System.out.println("Animal running...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}

class Tom extends Dog{
    void speak(){
        System.out.println("Speaking...");
    }
}

public class InheritanceClass {
    public static void main(String[] args) {
        Tom obj = new Tom();
        obj.bark();
        obj.speak();
        obj.run();
    }
}
