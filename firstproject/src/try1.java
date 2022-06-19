import java.util.ArrayList;
import java.util.regex.*;

// class try2
// {
//     class try3
//     {
//     public int meth1(int a,int b)
//     {
//         return a+b;
//     }
//     public int meth2()
//     {
//         int c=meth1(2,2);
//         return c;
//     }
//    }
// }
interface try2 
{
    public void meth1();
}
abstract class try4
{
   abstract public void meth1();
}
class try1
{
    public static void main(String[] args) {
      
        // try4 t1=new try4(){

        //     public void meth1()
        //     {
        //         System.out.println("I am meth1");
        //     }
        // };
        // t1.meth1();
        // // try3 t=new try3();

        
       String s="abc";
       String s1;
       String regex ="[ab]";
        
        
    // System.out.println(s.indexOf("what you"));
    
    // System.out.println(s.replaceAll(s.substring(4),""));


       while(true)
       {
       for(int i=0;i<s.length();i++)
        {
             s1=String.valueOf(s.charAt(i));
            Pattern p=Pattern.compile(regex);
            Matcher m=p.matcher(s1);
        if(m.matches())
        {
            System.out.println("yes");
            
        }
        else
        {
            System.out.println("no");
        }
    }
    break;
}
    // System.out.println(s.charAt(8));
      
    // for(int i=0;i<5;i++)
    // {
    //     System.out.println(i);
    //     if(i==4)
    //     {
    //         break;
    //     }
    // }
    
    }   
}
