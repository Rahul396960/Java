package libraryclass.RPackage;

import java.util.Random;

public class RSecurity {

    public String randomvalue(int range)
    {

        String c="";
        Random r=new Random();
        for(int i=0;i<range;i++)
        {
            // c=c+String.valueOf(s.charAt(r.nextInt(s.length())));
            c+=String.valueOf((char)(r.nextInt(84)+41));
        }
        return c;
    }
    public String encrypt(String passString)
    {
        String encryptstring="";
        char[] ch=passString.toCharArray();
        for(char ch1:ch)
        {
            ch1+=1;
            encryptstring+=String.valueOf(ch1);
        }
        return encryptstring;
    }
    public String decrypt(String passString)
    {
        String encryptstring="";
        char[] ch=passString.toCharArray();
        for(char ch1:ch)
        {
            ch1-=1;
            encryptstring+=String.valueOf(ch1);
        }
        return encryptstring;
    }
    public static void main(String[] args) {
        RSecurity rs=new RSecurity();
        for(int i=0;i<100;i++)
            System.out.println(rs.randomvalue(10));
    }
}
