package RPackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SelectedChar {

    public boolean checkString(String passString, String passChar) {
        // String passedchar = "[" + passChar + "]";
        String passedchar = passChar;

        String character;
        boolean b = true;

        for (int i = 0; i < passString.length(); i++) {
            character = String.valueOf(passString.charAt(i));
            Pattern p = Pattern.compile(passedchar);
            Matcher m = p.matcher(character);
            if (m.matches()) {
                b = true;
            } else {
                b = false;
                break;
            }
        }

        return b;

    }
    public static void main(String[] args) {
        String s="pass123",s1="r_*r`GFC%_";
        String s2=s+s1;
        String s3="pass123r_*r`GFC%_";
        char c,c1;
      
        if(s2.length()==s3.length())
        {
            System.out.println("equal");
            for(int i=0;i<s2.length();i++)
            {
                if(s2.charAt(i)==s3.charAt(i))
                {
                    System.out.println("characters Equal");
                }
                else{
                    System.out.println("characters not Equal");
                }
            }
        }
        else{
            System.out.println("not equal");
        }

    }
}
