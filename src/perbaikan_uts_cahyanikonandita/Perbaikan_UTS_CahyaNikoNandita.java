package perbaikan_uts_cahyanikonandita;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Perbaikan_UTS_CahyaNikoNandita {
    public static void main(String[] args) {
        Connection conn = koneksi.getConnection();
        
        if (conn != null) {
            try {
                String query = "SELECT * FROM mhs";
                PreparedStatement statement = conn.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery();
                
                while (resultSet.next()) {
                    String data = resultSet.getString("email");
                    System.out.println("Percobaan menampilkan eMail: " + data);
                }
                
                statement.close();
                resultSet.close();
            } catch (SQLException e) {
                System.out.println("Query gagal! Error: " + e.getMessage());
            }
        } else {
            System.out.println("Tidak dapat membuat koneksi.");
        }
    }
}
