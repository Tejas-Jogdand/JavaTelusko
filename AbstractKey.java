abstract class car
{
    public abstract void drive();
    public abstract void fly();
    public void playMusic()
    {
        System.out.println("Play music");
    }
}

abstract class WagonR extends car
{
    
    public void drive()
    {
        System.out.println("Slow driving");
    }

    // public void fly() {
    //     System.out.println("Flying");
    // }
}

class UpdatedWagonR extends WagonR
{

    public void fly() {
        System.out.println("Flying");
    }

}

public class AbstractKey {
    public static void main(String[] args) {
        
        // car obj = new car(); // can not create object of abstract class, you can create refrence obj

        car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
