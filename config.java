package database;
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.SQLException;

public class config {
    private static Connection koneksi;
    
    public static Connection getKoneksi()throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/universitas";
            String user = "root";
            String pass = "";
            
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url, user, pass);
        }catch(SQLException e){
            System.out.println("Koneksi ke Database Gagal " + e.getMessage());
        }
        return koneksi;
    }
}
