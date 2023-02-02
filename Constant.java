

class Class1{
    final int d = 10;
    public void printFinal(){
        // d = 12; gives error
        System.out.println(d);
    }
}
public class Constant {
    public static void main(String[] args) {
        //creating a local variable
        final int b = 1;
        System.out.println(b);
        // b = 2; gives an error
    }
}
