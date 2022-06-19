import java.util.function.BinaryOperator;

public class task {

    public static void main(String[] args) {
        
    String a="rahul";
    int b=a.length();

    double e=Math.pow(2, b);

    for(int j=0;j<e;j++)
    {
        String c=Integer.toBinaryString(j);
         int d= c.length();
        for(int i=0;i<(b-d);i++)
        {
            c="0"+c;
        }

        for(int k=0;k<b;k++)
        {
            char z=c.charAt(k);
            if(z=='1')
            {
                System.out.print(a.charAt(k));
            }
        }
        System.out.println(";");

    }
}

}

