import java.util.Scanner;

public class star{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a=0;

        System.out.println("enter the number of line of star you want:");
        a=sc.nextInt();
        for(int i=1;i<a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}