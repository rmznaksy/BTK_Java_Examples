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
            resultSet = statement.executeQuery();
            statement=connection.prepareStatement
                    ("insert into city (Name,CountryCode,District,Population) value('Ankara','TUR','Ankara',50000)");
            System.out.println("Kayıt Eklendi...");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
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