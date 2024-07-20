class Computer
{
    public void playMusic()
    {
        System.out.println("Music playing...");
    }
    public String getMeApen(int cost)
    {
        if (cost>=10)
            return "Pen";
        return "Nothing";
    }
}
class Demo
{
    public static void main(String[] args)
    {
        Computer computer = new Computer();
        computer.playMusic();
        String str = computer.getMeApen(9);
        System.out.println(str);
    }
}