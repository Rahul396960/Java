import java.sql.*;

public class database {
    public static void main(String[] args) {
        int i;

        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Library", "root", "");
            System.out.println("xampp mysql connected");
            Statement stat = con.createStatement();
            try{
            
            ResultSet rs = stat.executeQuery("select last_id from Books order by last_id desc");
            rs.next();
            System.out.println(rs.getString(1));
            i=Integer.parseInt(rs.getString(1));
            i++;
            }catch(Exception e){
                i=1;
            }
           stat.executeUpdate("insert into Books(book_id,book_name,Author_name,edition,Quantity,date,time,last_id) values('1','c++','rahul','1','2',str_to_date('11-02-2022','%d-%m-%y%y'),'122323','"+i+"')");
        } catch (Exception e) {
            System.out.println("Exception occured");
        }
    }
}
