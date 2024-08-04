enum Status
{
    Running, Failed, Pending, Success;
}
class Demo{
    public static void main(String[] args)
    {
        Status s = Status.Success;
        System.out.println(s);
        System.out.println(s.ordinal());
        System.out.println(s.getClass().getSuperclass());
        switch(s)
        {
            case Running:
                System.out.println("All Good!");
                break;
            case Failed:
                System.out.println("Try again!");
                break;
            case Pending:
                System.out.println("Please wait...");
                break;
            default:
                System.out.println("Done!");
                break;
        }
        Status[] ss = Status.values();

        // System.out.println(ss[1]);

        for(Status n : ss)
        System.out.println(n+" : "+n.ordinal());


     }
}