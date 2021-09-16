package _JDBC;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _JDBCParent {

    protected Statement statement;
    private Connection connection;

    @BeforeTest
    public void beforeTest() {
        String url = "jdbc:mysql://test.medis.mersys.io:33306/sakila";
        String user = "technostudy";
        String password = "zhTPis0l9#$&";
        // Veritabanına ulaşabilmek için JDBC ye : db nini tipi (mysql), db nin yolu (test.medis.mersys.io)
        // db nin bulunduğu bilgisayarın içindeki mysql db nin port numarası (33306) ve db nin adı verildi.
        try {
            connection = DriverManager.getConnection(url, user, password);// bağlantı sağlandı.
            statement = connection.createStatement();// sorgularımı çalıştırabilmek için bir yol oluştur.
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @AfterTest
    public void afterTest() throws SQLException {
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
