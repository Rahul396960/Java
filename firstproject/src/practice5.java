import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
// import java.util.Date;


public class practice5 {
    
    // public static void main(String[] args) {

        
        // ArrayDeque<Integer> l1=new ArrayDeque<>();

        // l1.add(23);
        // l1.add(33);
        // l1.add(35);
        // l1.add(21);
        // l1.add(12);
        // l1.add(3);

        // ArrayDeque<Integer> a=new ArrayDeque<>();
        // a.add(5);
        // // l1.addAll(0,a);
        // l1.addFirst(7);
        // l1.addLast(566);
        // l1.removeLast();
        // for(int i=0;i<l1.size();i++)
        // {
        //     System.out.println(l1.get(i));
        // }
        // System.out.println(l1.indexOf(5));
        // System.out.println(l1.lastIndexOf(1));
        
        // System.out.println(l1); 
        
        // Date d=new Date();
        // LocalDate ld=  LocalDate.now();
        // String df=DateFormat.getInstance().format(d);
        // LocalTime lt=LocalTime.now();
        // LocalDateTime ldt=LocalDateTime.now();
        // DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
        // DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
        // System.out.println(d);
        // System.out.println(lt);   
        // System.out.println(ld); 
        // System.out.println(df); 
        // System.out.println(ldt);         
        // System.out.println(ldt.format(dtf)); 
        // System.out.println(ldt.format(dtf3)); 
        // System.out.println(d.getTime()/1000/60/60/24/365);      
        // System.out.println(System.currentTimeMillis());      

        // System.out.println(d.getDate());
        // System.out.println(d.getTime());
    // }

    public void time()
    {
        Calendar c1=Calendar.getInstance();
        System.out.println(c1.getTime());
        // System.out.println(c1.getTimeZone().getID());
        System.out.println(c1.get(Calendar.DATE)+"-"+c1.get(Calendar.MONTH)+"-"+c1.get(Calendar.YEAR));
        // System.out.println(c1.get(Calendar.DAY_OF_MONTH)+"-"+c1.get(Calendar.MONTH)+"-"+c1.get(Calendar.YEAR));
        System.out.println(c1.get(Calendar.HOUR)+":"+c1.get(Calendar.MINUTE)+":"+c1.get(Calendar.SECOND));
        System.out.println(c1.get(Calendar.HOUR_OF_DAY)+":"+c1.get(Calendar.MINUTE)+":"+c1.get(Calendar.SECOND)+"--");
    }

        public static void main(String[] args) {
            
        // Calendar c=Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));

        // practice5 p=new practice5();
        
        // TimerTask t=new TimerTask(){
        //     public void run() {
        //         p.time();
        //     }
        // };

        // Timer t1=new Timer();
       
        // t1.schedule(t, 0, 1000);
        
        // for(int i=0;i<=TimeZone.getAvailableIDs().length;i++)
        // System.out.println(TimeZone.getAvailableIDs()[i]);


        // ArrayList<Integer> a= new ArrayList<>();

        //     a.add(2);
        //     a.add(3);
        //     a.add(4);
        //     a.add(5);
        //     a.add(6);
        //     a.add(7);
        //     a.add(8);

        //     for(int i=0;i<a.size();i++)
        //     {
        //     System.out.println(a.get(i));
        //     }

        // HashSet<Integer> s=new HashSet<>();

        // s.add(2);
        // s.add(3);
        // s.add(4);
        // s.add(5);
        // s.add(6);
        // s.add(7);
        // s.add(6);

        // System.out.println(s);

            // Date d=new Date();
            // Calendar c=Calendar.getInstance();
            // LocalTime l=LocalTime.now();
            // LocalDateTime ldt= LocalDateTime.now();
            // DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm:ss--E H:m a");
            // System.out.println(d);
            // System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
            // System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
            // System.out.println(ldt.format(dtf));


    }
}
