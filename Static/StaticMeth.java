package Static;

class Class1{
    static int var = 1;
    static void meth(){
        System.out.println(var);
        var++;
    }
}
public class StaticMeth {
    public static void main(String[] args) {
        Class1.meth();
        Class1.meth();
        Class1.meth();
        Class1.meth();
    }
}
