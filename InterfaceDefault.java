
interface Base{
    void draw();
    default int mul(int num){
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

public class InterfaceDefault {
    public static void main(String[] args) {
        Table t = new Table();
        t.draw();
        System.out.println(t.mul(3)); //This will execute overridden method in Table class
    }
}
