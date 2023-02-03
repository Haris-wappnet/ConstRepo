
public class StaticBlock {
    static int counter = 1;
    public StaticBlock(){
        System.out.println("value of counter is "+ counter);
        counter++;
    }
    static{
        System.out.println("This is a static block");
    }
    public static void main(String[] args) {
        StaticBlock b = new StaticBlock();
        StaticBlock b1 = new StaticBlock();
        StaticBlock b2 = new StaticBlock();
        
    }
}
