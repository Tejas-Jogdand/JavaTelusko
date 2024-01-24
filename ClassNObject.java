class computer
{
    public void playMusic()
    {
        System.out.println("Playing Music");
    }
    public String getMeAPen(int cost)
    {   
        if (cost>=10)
        return "pen";

        return "Nothing";
    }
}
public class ClassNObject {
    public static void main(String[] args)
    {
        computer obj = new computer();

        System.out.println(obj.getMeAPen(5));
        obj.playMusic();
    }
}
