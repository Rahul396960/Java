package libraryclass.RPackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SelectedChar {

    public boolean checkcharinrange(String passString, String passChar) {
        String passedchar = "[" + passChar + "]";
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
        
        SelectedChar sc=new SelectedChar();
        System.out.println(sc.checkcharinrange("12-2", "-0-9"));
    }
}
