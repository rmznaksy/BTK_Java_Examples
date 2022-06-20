import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql= "insert into city (Name,CountryCode,District,Population) value(?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"Ankara");
            statement.setString(2,"TUR");
            statement.setString(3,"Turkey");
            statement.setInt(4,150000);

            statement.executeUpdate(); // kaç kayıt etkilendi onu gösterir
            System.out.println("Kayıt Eklendi...");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }

    }

    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            //  System.out.println("Bağlantı gerçekleşti...");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from country");
            ArrayList<Country> countries = new ArrayList<Country>();
            while (resultSet.next()) {
                //System.out.println(resultSet.getString("id"));
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }
            System.out.println("Eleman sayısı: " + countries.size());
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }
    }
}