package creational.singleton;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        EnumDatabaseConnection connection = EnumDatabaseConnection.INSTANCE;
        connection.getDbUrl();

        EnumDatabaseConnection conn2 = EnumDatabaseConnection.INSTANCE;
        conn2.getDbUrl();
    }
}
