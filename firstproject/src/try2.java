import java.util.Random;

public class try2 {
    public static void main(String[] args) {
        String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"!@#$%^&*()_+-=:<>?/|"+"1234567890"+"abcdefghijklmnopqrstuvwxyz";

        String c="",st="",st1="";

        Random r=new Random();
        for(int i=1;i<=10;i++)
        {
            c=c+String.valueOf(s.charAt(r.nextInt(s.length())));
        }
        System.out.println(c);
        char[] ch=c.toCharArray();
        for(char c1:ch)
        {
            c1+=1;
            System.out.println(c1);
            st+=String.valueOf(c1);
        }
        System.out.println(st);

        char[] ch1=st.toCharArray();
        for(char c1:ch1)
        {
            c1-=1;
            System.out.println(c1);
            st1+=String.valueOf(c1);
        }
        System.out.println(st1);
    }
}
