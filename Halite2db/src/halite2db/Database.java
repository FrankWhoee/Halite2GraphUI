package halite2db;
import java.sql.*;
import java.util.ArrayList;


public class Database {

    public static ResultSet rs;
    
    public static String getString(String execute, String column) throws Exception{
	try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://pvporbit.com:3306/pvporbi1_halite2","pvporbi1_halite2","halite2_public");  
            //here pvporbi1_halite2 is database name, pvporbi1_halite2 is username and halite2_public is password  
            Statement stmt=con.createStatement();  
            String returnSTMT = "DATABASE.getString: No input. Nothing to return.";
            rs = stmt.executeQuery(execute);
            while(rs.next()){
                returnSTMT = rs.getString(column);
            }  
            con.close();
            return returnSTMT;
	}catch(Exception e){
            System.out.println(e);
            return null;
        }  
    }  
    public static ArrayList<Double> getAxis(String execute, String column) throws Exception{
	try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://pvporbit.com:3306/pvporbi1_halite2","pvporbi1_halite2","halite2_public");  
            //here pvporbi1_halite2 is database name, pvporbi1_halite2 is username and halite2_public is password  
            Statement stmt=con.createStatement();  
            rs = stmt.executeQuery(execute);
            ArrayList<Double> returnSTMT = new ArrayList<>();
            while(rs.next()){
                returnSTMT.add(Double.parseDouble(rs.getString(column)));
            }  
            con.close();
            return returnSTMT;
	}catch(Exception e){
            System.out.println(e);
            return null;
        }  
    } 
}
	

