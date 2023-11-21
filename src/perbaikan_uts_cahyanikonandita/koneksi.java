package perbaikan_uts_cahyanikonandita;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection conn = null;
    
    public static Connection getConnection() {
        if (conn != null)
            return conn;
        
        try {
            String url = "jdbc:mysql://localhost:3306/mahasiswa";
            String user = "root";
            String password = "";
            
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi sukses!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal! Error: " + e.getMessage());
        }
        
        return conn;
    }
}
