import java.util.Scanner;

import javax.print.Doc;

import java.util.Random;

// public class methods {

//   static int fact(int n)
//   {
  
//     if(n==0)
//     {
//         return 1;
//     }
//     else
//     {
//       return n*fact(n-1);
//     }
//  }
//     static int fact_for(int n)
//     {
//         int res=1;
//         for(int i=n;i>=1;i--)
//         {
//             res*=i;
//         }
//         return res;
//     }

  
//     public static void main(String[] args) {

//         methods m=new methods();
         
//         int x=1;
//         System.out.println(m.fact(x));
//         System.out.println(m.fact_for(x));

//     }
    
      // static int fibo(int x)
      // {
      //   int [] a=new int [x];
      //  a[0]=0; a[1]=1;
      //  System.out.println();
      //   System.out.print(a[0]+" ");
      //   System.out.print(a[1]+" ");

      //   for(int i=0;i<x-2;i++)
      //   {
      //     a[i+1+1]=a[i]+a[i+1];
      //     System.out.print(a[i+1+1]+" ");

      //   }
      //     return 0;
      // }
      // static int fibo2(int y)
      // {
      //   int n1=0,n2=1,n3;
      //   System.out.println();
      //   System.out.print(n1+" ");
      //   System.out.print(n2+" ");
      //   for(int i=2;i<y;i++)
      //   {
      //      n3=n1+n2;
      //      System.out.print(n3+" ");
      //      n1=n2;
      //      n2=n3;
      //   }
      //   return 0;
      // }

      // static int star(int x)
      // {
      //   int l=Math.floorDiv(x,2);
      //   for(int i=0;i<=x;i+=2)
      //   {
      //     for(int k=0;k<l;k++)
      //     {
      //       System.out.print(" ");
      //     }
      //     l--;
      //     for(int j=0;j<=i;j++)
      //     {
      //       System.out.print("*");
      //     }
      //     System.out.println();
      //   }
      //   l=0;
      //   for(int i=x;i>=0;i-=2)
      //   {
      //     for(int j=0;j<=i;j++)
      //     {
      //       System.out.print("*");
      //     }
      //     System.out.println();

      //     for(int k=0;k<=l;k++)
      //     {
      //       System.out.print(" ");
      //     }
      //     l++;
      //   }
      //   return 1;
      // }
      // static int sum(int n)
      // {
      //   if(n==1)
      //   {
      //     return 0;
      //   }
      //   else if(n==2)
      //   {
      //     return 1;
      //   }
      //   else
      //   {
      //   return sum(n-1)+sum(n-2);
      //   }
      // } 
      // static int avg(int [] n)
      // {
      //   int sum=0,l;
      //     for(int i:n)
      //     {
      //       sum=sum+i;
      //     }
      //     l=sum;
      //     return l/n.length;
      // }

      // static int avg(int ...n)
      // {
      //   int sum=0;
      //   for(int e:n)
      //   {
      //     sum=sum+e;
      //   }
      //   return sum;
      // }
      // static int star(int n)
      // {
      //   if(n==0)
      //   {
      //     return 0;
      //   }
      //   System.out.print("*");
      //   return star(n-1);
      // }
      // static int star1(int a,int i)
      // {
      //   if(a==0)
      //   {
      //     return 0;
      //   }
      //   star(a);
      //   System.out.println();

      //   return star1(a-1,i+1);

      // }
      // static int star2(int a,int i)
      // {
      //   if(a==0)
      //   {
      //     return 0;
      //   }
      //   star(i);
      //   System.out.println();

      //   return star2(a-1,i+1);

      // }

      // static void num(int i)
      // {
      //   if(i>0)
      
      //   {
      //     for(int a=0;a<i;a++)
      //     {
      //       System.out.print("*");
      //     }
      //     System.out.println();
      //     num(i-1);
      //   }
      // }
      // static int farh(int a)
      // {
      //   int c;
      //   c=(a*(9/5))+32;
      //   return c;
      // }
      
    //  class base
    //  {
    //    public int a=2;
    //    public int b=4;
    //    public int c=2;
    //     base(){
    //       a=10;
    //     }

    //    public int get()
    //    {
    //      c=a+b;
    //      System.out.println(c);
    //      return c; 
    //    }
    //  }
    //    class der extends base
    //    {
    //      int x;
    //      der(){
    //         x=5;
    //      }
    //      public void get1()
    //      {
    //        System.out.println(super.a);

    //        super.get();
    //      }
    //    }

    // class Base{
    //   public int x=2;
    //   Base()
    //   {
    //     System.out.println("I am a base class constructor "+x);
    //   }
    //   Base(int x,int y)
    //   {
    //     System.out.println("I am a base class overloaded constructor "+x+" "+y);
    //   }
    // }
    // class Derived extends Base
    // {
    // Derived()
    // {
      
    //   System.out.println("I am a derived class constructor "+x);
    // }
    // Derived(int x,int y)
    // {
    //   super(x,y);
    //   System.out.println("I am a derived class overloaded constructor "+x+" "+y);
    // }
    // }
    // class DerChild extends Derived
    // {
    // DerChild()
    // {
      
    //   System.out.println("I am a derchild class constructor "+x);
    // }
    //   DerChild(int x,int y,int z)
    // {
    //   super(x,y);
    //   System.out.println("I am a derchild class overloaded constructor "+x+" "+y+" "+z);
    // }
    // }

    // class Ekclass
    // {
    //   int a;

    //   public int g()
    //   {
    //     return a;
    //   }
    //   Ekclass(int v)
    //   {
    //     this.a=v;
    //     System.out.println("i am base class contructor "+a);
    //   }
    // }
    // class Doclass extends Ekclass
    // {
    //   Doclass(int x)
    //   {
    //     super(x);
    //     System.out.println("i am serived class constructor "+x);
    //   }
    // }

    // class A
    // {
    //   public void meth2()
    //   {
    //     System.out.println("i am meth2 of class A ");
    //   }
    // }
    // class B extends A
    // {
    //   // public void meth2()
    //   // {
    //   //   System.out.println("I am meth2 of class B");
    //   // }
    //   public void meth3()
    //   {
    //     System.out.println("I am meth3 of class B");
    //   }
    // }

//     class First
//     {
//       public void meth1()
//       {
//         System.out.println("i am meth1 of class first");
//       }

      
//     }
//     class Second extends First
//     {
//       // public void meth1()
//       // {
//       //   System.out.println("I am meth1 of class second");
//       // }
//       public void meth2()
//       {
//         System.out.println("I am meth2 of class second");
//       }
      
//     }

//       public class methods {
//       public static void main(String[] args) {

//         // methods m=new methods();
//         First f=new Second();
//         First f1=new First();
//         Second s=new Second();

//         f.meth1();
//         f1.meth1();
//         s.meth2();
//         s.meth1();
       

           
      

//      }

// }
