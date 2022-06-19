

import java.util.Scanner;

// abstract class try1
// {
//    abstract  void meth1(int i);
// }
// class childtry1 extends try1{

//      void meth1(int i)
//     {
//         System.out.println(i);
//     }
// }

// interface base
// {
//     void meth1(int i);
//     void meth2();
// }
// class der implements base
// {
//    public void meth1(int i)
//     {
//         System.out.println("hey"+i);
//     }
//     public void meth2()
//     {
//         System.out.println("bye");
//     }
// }
// interface Camera 
// {
//     void takesnap();
//     void recordvideo();
//     default void sample()
//     {
//         System.out.println("just try and error");
//     }
// }
// interface wifi
// {
//     void connect();
//     void disconnect();
// }
// class cellphone
// {
//     public void call()
//     {
//         System.out.println("calling..");
//     }
//     public void pickcall()
//     {
//         System.out.println("someone is calling");
//     }
// }
// class Smartphone extends cellphone implements Camera,wifi
// {
//     public void takesnap()
//     {
//         System.out.println("taking snap..");
//     }
//     public void recordvideo()
//     {
//         System.out.println("record video...");
//     }
//     public void connect()
//     {
//         System.out.println("connecting to network");
//     }
//     public void disconnect()
//     {
//         System.out.println("disconnect network..");
//     }
// }

// interface sample1
// {
//     void meth1();
//     void meth2();
// }
// interface childsample1 extends sample1
// {
//     void meth3();
//     void meth4();
// }
// class intimp implements childsample1
// {
//     public void meth1()
//     {
//         System.out.println("i am methed1");
//     }
//     public void meth2()
//     {
//         System.out.println("i am methed2");

//     }
//     public void meth3()
//     {
//         System.out.println("i am methed3");

//     }
//     public void meth4()
//     {
//         System.out.println("i am methed4");

//     }
// }

// abstract class pen
// {
//     abstract void write();
//     abstract void refill();
//      void erase()
//     {
//         System.out.println("erasing...");
//     }
// }
// class fountpen extends pen
// {
//      void write()
//     {
//         System.out.println("writing...");
//     }
//      void refill()
//     {
//         System.out.println("refilling...");
//     }
//      void changepen()
//     {
//         System.out.println("changing pen...");
//     }
// }

// class monkey
// {
//     void jump()
//     {
//         System.out.println("jumping");
//     }
//     void bite()
//     {
//         System.out.println("biting");
//     }
// }
// interface monkeyaction
// {
//     void sleep();
//     void eats();
// }
// class human extends monkey implements monkeyaction
// {
//     void speak()
//     {
//         System.out.println("hello sir !");
//     }
//     public void sleep()
//     {
//         System.out.println("Sleeping");
//     }
//     public void eats()
//     {
//         System.out.println("eating");
//     }
// }

// abstract class telephone
// {
//     abstract void ring();
//     abstract void lift();
//     abstract void disc();
// }
// class Smarttelephone extends telephone
// {
//      void ring()
//      {
//          System.out.println("ringing...");
//      }
//      void lift()
//      {
//          System.out.println("lifting...");
//      }
//      void disc()
//      {
//          System.out.println("disconnected...");
//      }
//      void call()
//      {
//          System.out.println("calling...");
//      }
// }

// interface tvremote
// {

// }
// interface Smarttvremorte extends tvremote
// {

// }
// class TV implements tvremote
// {
    
// }

class builtin
{
    String m;
    
    public void display()
    {
        java.util.Scanner s=new java.util.Scanner(System.in);
         m=s.nextLine();
        System.out.println(m);
    }
}
public class practice3 {

 public static void main(String[] args) {
     
    builtin b=new builtin();
    b.display(); 

 }
}
