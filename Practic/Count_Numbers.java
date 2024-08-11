import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        String s;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        s=sc.next();
        int n = s.length();
        String ch="";
        for(int i=0; i<n; i++)
        {
                if (ch.contains(String.valueOf(s.charAt(i)))==false)
                {
                  
                    ch = ch+s.charAt(i);
                
                    for(int j=i+1; j<n; j++)
                    {
                    
                            if(s.charAt(i)==s.charAt(j))
                            {
                                count++;
                                break;
                            }
                            
                    } 
                }
        }
        System.out.println(count);

    }
}