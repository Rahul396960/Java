import java.util.concurrent.ExecutionException;

import javax.swing.plaf.synth.SynthStyle;

import java.util.Scanner;

// class thread1 implements Runnable
// {
//     int a=0;
//     public void run()
//     {
//         while(a<10)
//         {
//         System.out.println("i am thread1");
//         a++;
//         }
//     }
// }
// class thread2 implements Runnable
// {
//     int a=0;
//     public void run()
//     {
//         while(a<10)
//         {
//         System.out.println("i am thread2");
//         a++;
//         }
//     }
// }
// class myth extends Thread
// {
//           myth(String i)
//     {
//         super(i);
//         // System.out.println("i am method of myth"+i);
//     }
//     public void run()
//     {
//         int a=0;
//         while(a<100)
//         {
//         System.out.println("i am run method"+this.getName());
//         a++;
//         }
//     }
// }

// class mythread1 extends Thread
// {
//     int i=0;
    
//    public void run()
//    {
//      while(i<10)
//      {
//          System.out.println("Good morning");
//          i++;
//      }
//    }
// }
// class mythread2 extends Thread
// {
//     int i=0;
    
//    public void run()
//    {
//      while(i<10)
//      {
//          try{
//              Thread.sleep(200);
//          }
//          catch(Exception e)
//             {
//                 System.out.println(e);
//             }
//                      System.out.println("welcome");
//          i++;
//      }
//    }
// }
// class myexception extends Exception{
//     @Override
//     public String toString() {
//         return "i am tostring";
//     }
//     @Override
//     public String getMessage() {
//         return "i am getmessage";
//     }
// }
// class myexception2 extends Exception
// {
//     @Override
//     public String toString() {
//         // printStackTrace();
//         return "radius can't be negative";
//     }
    
// }
class myexception3 extends Exception
{
    @Override
    public String toString() {
        return "number should not be zero";
    }
}
class Calculator
{
    double add(int a,int b)
    {
        return a+b;
    }
    double sub(int a,int b)
    {
        return a-b;
    }
    double mult(int a,int b)
    {
        return a*b;
    }
    double div(int a,int b)throws myexception3
    {
        if(a==0)
        {
            throw new myexception3();
        }
        if(b==0)
        {
            throw new myexception3();
        }
        return a/b;
    }
}
public class practice4 {
    public static void main(String[] args)throws myexception3
     {
        
        Scanner sc=new Scanner(System.in);

       int a=0;
       int b=0;
       char choose=0;

       System.out.println("1 to add");  
       System.out.println("2 to sub");  
       System.out.println("3 to mult");  
       System.out.println("4 to div");  

       System.out.println("enter the choice");  
        choose=sc.next().charAt(0);
        System.out.println("enter the first number");
        a=sc.nextInt();  
        System.out.println("enter the second number");
b=sc.nextInt();

Calculator c=new Calculator();

if(choose=='1')
      {
        System.out.println(c.add(a,b));
        }   
        else if(choose=='2')
        {
            System.out.println(c.sub(a,b));
        }else if(choose=='3')
        {
            System.out.println(c.mult(a,b));
        }else if(choose=='4')
        {
            System.out.println(c.div(a,b));
        }else 
        {
        System.out.println("Invalid input");
        }
     }  
}
