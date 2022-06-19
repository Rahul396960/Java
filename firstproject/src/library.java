// package learning;

import java.util.Scanner;

class Library {

    Scanner sd = new Scanner(System.in);

    String b=" ",e=" ";

    public String issuebook(String[] n,int n1) {
        System.out.println();
        System.out.println("these all are books");

        for (int i=0;i<n1;i++) {
            System.out.println(n[i].toUpperCase());
        }
        System.out.println();
        System.out.print("enter the book you want:");
         b=sd.nextLine().toUpperCase();
    
        return b;
    }

    public String addbook() {
        System.out.println();
        System.out.print("add book: ");
        String e = sd.next().toUpperCase();

        return e;
      
    }

    public void checkbooks(String d,String [] n,int n1)
    {

        String [] nc=n;
        System.out.println();
        System.out.println("the availble books are :-");

        for(int j=0;j<n1;j++)
        {
            if(nc[j].toUpperCase().contains(d))
            {
                nc[j]=d+"-"+"Unavailable";
            }
            System.out.println(nc[j]);
        }
        n=nc;

    }

    public static void main(String[] args) {

       
        int a;
        int t=0;
        int n1=6;
        String c=" ",f="";



        Scanner sc = new Scanner(System.in);

        while (true) {

            String[] n =new String[n1];
            n[0] = "physics";
            n[1] = "maths";
            n[2] = "Computer";
            n[3] = "Science";
            n[4] = "Bussiness";
            n[5] = "Software";

            String d=c; 
            
            Library l = new Library();

            if(t==1)
            {
                 n[n1-1]=f;
            }

            System.out.println();
            System.out.println("choose '1' to issue book");
            System.out.println("choose '2' to add book");
            System.out.println("choose '3' to check available book");
            System.out.println("choose '4' to return book");
            System.out.println("choose '5' to exit");
            System.out.println();
            System.out.print("make a choice: ");
            a = sc.nextInt();

         
            if (a == 1) 
            {
                 c=l.issuebook(n,n1);
            } 
            else if (a == 2) 
            {
                n1++;
                // System.out.println(n1);
               f=l.addbook();
            //    System.out.println(f);
               t=1;
               
            } 
            else if (a == 3) 
            {
                l.checkbooks(d,n,n1);
            } 
            else if (a == 4) 
            {

            } 
            else if (a == 5)
             {
                break;
            }

        }

    }

}
