import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors
{
   public static void main(String[] args) {
    Random r = new Random();
    Scanner sc = new Scanner(System.in);

    String name="";
    int rounds;

    System.out.println("");
    System.out.print("Enter your name: ");
    name= sc.nextLine().toUpperCase();

    System.out.println("");
    System.out.print("Enter the numbers of rounds you want to play: ");
    rounds= sc.nextInt();

    while (true) {

      System.out.println("");
      System.out.println("for scissors type '1'");
      System.out.println("for Rock type '2'");
      System.out.println("for paper type '3'");
      System.out.println("to restart game type '4'");
      System.out.println("to exit this game type '5'");

      int you=0,round,t1=0,t2=0;

      round=1;
      while (round<=rounds) {

        int ran = r.nextInt(3) + 1;
        String comp = "";
  
        if (ran == 1) {
          comp = "Scissors";
        } else if (ran == 2) {
          comp = "Rock";
        } else if (ran == 3) {
          comp = "paper";
        }

        
        System.out.println("");
        System.out.println("Round "+round);
        System.out.print("enter the choice:");
         you = sc.nextInt();

        String t="", comp1 = "";

        if (you == 1) {
          comp1 = "Scissors";
        } else if (you == 2) {
          comp1 = "Rock";
        } else if (you == 3) {
          comp1 = "paper";
        }
        else if (you == 5) {
          System.out.println("Thanks for playing");
          break;
        }
        else if (you == 4) {
          System.out.println("This game is ended");
          break;
        }
        else {
          System.out.println("Invalid input");
        }

       
        if ((you == 3) && (ran == 1)) {
          t = "computer won";
        } else if ((you == 1) && (ran == 3)) {
          t = name+" won ";
        } else if (you > ran) {
          t = name+" won ";
        } else if (you < ran) {
          t = "computer won";
        } else if (you == ran) {
          t = "draw";
        } 

         
        if(t.contains("computer won"))
        {
           t1=t1+1;
        }
        else if(t.contains(name+" won "))
        {
           t2=t2+1;
        }

        System.out.println("computer did " + comp + " you did " + comp1 + " " +"'"+t+"'");
        round++;
      }

      if (you == 5) {
        System.out.println("");
        System.out.println("Thanks for playing");
        break;
      }
      
      if(t1<t2)
      {
        System.out.println("");
      System.out.println( name+" is the winner of this match");
    }
     else if(t1>t2)
     {
      System.out.println("");
      System.out.println("Computer is the winner of this match");
     }
     else
     {
      System.out.println("");
      System.out.println("both won "+t1+" rounds so match got tie");
     }
    }
   }
        
    
}