import java.sql.*;

public class Main {
    public static void main( String[] args ) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cx = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/test-jdbc",
            "root",
            "root"
        );
        Statement st = cx.createStatement();
        ResultSet rs = st.executeQuery( "SELECT * FROM personnes" );
        while (rs.next()) {
            String nom = rs.getString("nom");
            int age = rs.getInt("age");
            System.out.println( nom + " a " + age + " ans" );
        }
        rs.close();
        st.close();
        cx.close();
    }
}