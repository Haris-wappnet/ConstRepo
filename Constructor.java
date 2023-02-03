
class School{
    int roll_no;
    String name;
    //non parametarized constructor
    School(){
        roll_no = 1;
        name = "harry";
    }
    //parameterized constructor
    School(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
    //copy constructor
    School(School s){
        roll_no = s.roll_no;
        name = s.name;
    }
    public void printDetails(){
        System.out.println("Roll number is " + roll_no + " and name is "+ name);
    }
}
public class Constructor {
    public static void main(String[] args) {
        School sc = new School();
        sc.printDetails();
        School obj = new School(12,"Rohan");
        obj.printDetails();
        School s = new School(sc);
        s.printDetails();
    }
}
