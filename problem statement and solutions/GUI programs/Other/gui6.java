import java.sql.*;
import java.util.*;
public class gui6 {

    public static void main(String[] args) {
        
        String url="jdbc:mysql://localhost:3306/vit";
        String user="root";
        String pwd="abcXYZ1@";
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rollNo: ");
        int rno = sc.nextInt();
        
        System.out.println("Enter Sname: ");
        String sname = sc.next();
        Connection con=null;
                PreparedStatement ps = null;
        try {
             Class.forName("com.mysql.jdbc.Driver");
                         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vit","root","abcXYZ1@");
             Statement st=con.createStatement();
             
             String sqlInsert="insert into CSA values('"+rno+"','"+sname+"')";
             st.executeUpdate(sqlInsert);
             System.out.println("record inserted successfully");
             
             
             String sql="select * from CSA";
             ResultSet rs= st.executeQuery(sql);
             while(rs.next()) {
                 System.out.println("RollNo: "+rs.getInt(1));
                 System.out.println("Sname: "+rs.getString(2));
                 
             }

            //  String sqlupdate="update CSA set sname='ABC' where rno=2";
            //  st.executeUpdate(sqlupdate);
            //  System.out.println("record updated successfully");
////             
////             
             String sqldelete="delete from CSA where rno=10";
             st.executeUpdate(sqldelete);
             System.out.println("record deleted successfully");
             
             
             
             con.close();
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
        
    }

}
