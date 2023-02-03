
interface Base{
    void draw();
    static int mul(int num){
        return num*num;
    }
}
class Table implements Base{
    public void draw(){
        System.out.println("Drawing...");
    }
    public int mul(int num){
        return num;
    }
}

public class InterfaceStatic{
    public static void main(String[] args) {
        Table t = new Table();
        // t.draw();
        System.out.println(Base.mul(2));
        System.out.println(t.mul(2));
    }
}