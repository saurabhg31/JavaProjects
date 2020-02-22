package bookstore;
import java.io.*;
import java.sql.*;

public class BS {
    

public static void main(String args[]) {
        try
        {
            
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("INSERTION IN BOOK TABLE");
        System.out.println("Enter isdn");
        String v1=br.readLine();
        System.out.println("Enter B_name");
        String v2=br.readLine();
        System.out.println("Enter price");
        String v3=br.readLine();
        System.out.println("Enter publisher");
        String v4=br.readLine();
        System.out.println("Enter type");
        String v5=br.readLine();
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/ardentdb","ardent","123");
        Statement rs=con.createStatement();
        String sql="insert into book values('"+v1+"','"+v2+"',"+v3+",'"+v4+"','"+v5+"')";
        rs.executeUpdate(sql);
        rs.close();
        System.out.println("Insertion Successful");
                      
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    
    }
}