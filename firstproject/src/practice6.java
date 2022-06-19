import java.io.File;

interface trying
{
    void meth1();
    // void meth2();
}
abstract class trying1
{
    abstract void meth1();
    // abstract void meth2();
}

public class practice6 {
    
    // public static void main(String[] args) {
       
    //     trying tr=()->
    //     {
    //         System.out.println("hey what's up");
    //     };
    //     tr.meth1();
// }

public static void main(String[] args) {
    
    File f=new File("new file.txt");
    try{
            f.createNewFile();
    }
    catch(Exception e)
    {
        System.out.println("hey you got error");
    }
    }
}
