class Constant3{
    final int b;
    static final int z = 12;
    Constant3(int a){
        b = a;
        //z = a; //throws an error because static final cannot be changed
        System.out.println("final b is "+ b);
    }
    public void checkConst(int a){
        final int c;
        c = a;
        System.out.println("The value of constant c is "+ c);
    }
}

public class Constant2 {
    public static void main(String[] args) {
        Constant3 cs1 = new Constant3(3);  //values may vary as we declare different objects
        Constant3 cs2 = new Constant3(7);
        cs1.checkConst(33);
        cs2.checkConst(55);
    }
}
