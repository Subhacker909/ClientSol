package db;
import java.sql.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Dbconnect {
static public Connection c;
static public Statement st;
static public PreparedStatement insertClient;
static public PreparedStatement getClient;
static public PreparedStatement updateClient;
static{
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
        c=DriverManager.getConnection("jdbc:mysql://localhost:3306/clientsol","root","root");
        st=c.createStatement();
        insertClient=c.prepareStatement("insert into client_info(name,gender,dob,country,address,language) values(?,?,?,?,?,?)");
        getClient=c.prepareStatement("select * from client_info where name like ?");
        updateClient=c.prepareStatement("update client_info set name=?,gender=?,dob=?,country=?,address=?,language=? where cid=?");
              }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e);
       }
}
        
}
