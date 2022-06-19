import java.util.Scanner;
import java.util.Date;
import java.sql.Connection;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class student
{
    public static void main(String[] args) {
        
        String name,div,attend;
        int roll_no;

        Scanner sc=new Scanner(System.in);
        Scanner sd=new Scanner(System.in);
       
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost/Students","root","");
        Statement stat=con.createStatement();
        try
        {
        stat.executeUpdate("create database Students");
        }
        catch(Exception e)
        {
        }
        try{
        stat.executeUpdate("create table attendance (sid int(5) not null auto_increment, name varchar(20) not null,roll_no int(5) not null ,Division varchar(2) not null, status varchar(10) not null,Date date,primary key(sid));");
        }
        catch(Exception e)
        {}
        System.out.println("enter the name:");
        name=sc.nextLine();
        System.out.println("enter the Roll no.:");
        roll_no=sd.nextInt();
        System.out.println("enter the Division:");
        div=sc.nextLine();
        System.out.println("enter the attendance:");
        attend=sc.nextLine();
        LocalDate ld =LocalDate.now();

        stat.executeUpdate("insert into attendance(name,roll_no,Division,status,Date) values('"+name+"',"+roll_no+",'"+div+"','"+attend+"','"+ld+"')");
        stat.executeUpdate("select * from attendance");
    }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}