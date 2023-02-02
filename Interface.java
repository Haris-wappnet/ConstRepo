
interface Bike{
    public void speed(int increment);
    public void brake(int decrement);
}
interface RacerBike{
    public void overSpeed(int inc);
    public void diskBrake(int dcr);
}
class Honda implements Bike{
    static int bikeSpeed = 60;
    public void speed(int increment){
        bikeSpeed = (bikeSpeed+increment);
        System.out.println("Speeding up... "+ bikeSpeed);
    }
    public void brake(int decrement){
        bikeSpeed = (bikeSpeed-decrement);
        System.out.println("Applying brakes..."+ bikeSpeed);
    }
}
class Kawasaki implements Bike,RacerBike{
    static int bikeSpeed = 60;
    public void speed(int increment){
        bikeSpeed = (bikeSpeed+increment);
        System.out.println("Speeding up... "+ bikeSpeed);
    }
    public void brake(int decrement){
        bikeSpeed = (bikeSpeed-decrement);
        System.out.println("Applying brakes..."+ bikeSpeed);
    }
    public void overSpeed(int inc){
        bikeSpeed = bikeSpeed+inc;
        System.out.println("Going on high speed mode..." + bikeSpeed);
    }
    public void diskBrake(int dsc){
        bikeSpeed = (bikeSpeed-dsc);
        System.out.println("Applying disk brake... "+ bikeSpeed );
    }
}

public class Interface{
    public static void main(String[] args) {
        Honda h = new Honda();
        h.speed(20);
        h.brake(10);

        Kawasaki k = new Kawasaki();
        k.speed(50);
        k.brake(30);
        k.overSpeed(100);
        k.diskBrake(50);
    }
}
