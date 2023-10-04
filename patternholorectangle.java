//patternholorectangle
import java.util.*;
class pat
{
  public static void main(String aa[])
  {
    for(int i=1;i<=10;i++)
    {
      for(int j=1;j<=51;j++)
      {
        if(i==1||j==1||i==10||j==51)
        {
          System.out.print("#");
        }
        else
        {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  
  }
}
