// package Learning;

import java.util.Scanner;
import java.util.Random;

class employee
      {
        public void right()
        {
          System.out.println("its correct");
        }
        public void condition(int a,int b)
        {
          if(b<a)
          {
            System.out.println("you guessed larger number");
          }
          else
          {
            System.out.println("you guessed smaller number");
          }
        }
     
      }
      public class guessthenumber {

      public static void main(String[] args) {
          
        // methods m=new methods();
        employee e=new employee();

        Scanner sc=new Scanner(System.in);
        Random r=new Random();

        int p=0;
        int comp=r.nextInt(50)+1;
        System.out.println("the number is between 1 to 50");

        while(true)
        {
        System.out.println("Guess the number: ");
        p=sc.nextInt();

        if(p==comp)
        {
          e.right();     
          break;
        }
        else if(p==0)
        {
          System.out.println("you have to choose greater than zero");
        }
        else
        {
          e.condition(p,comp);
        }


      }
    }
}

