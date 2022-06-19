package RPackage;

import java.util.Random;

public class RSecurity {

    public String randomvalue(int range)
    {
        String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"!@#$%^&*()_+-=:<>?/|"+"1234567890"+"abcdefghijklmnopqrstuvwxyz";

        String c="";
        Random r=new Random();
        for(int i=0;i<range;i++)
        {
            c=c+String.valueOf(s.charAt(r.nextInt(s.length())));
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
}
