import java.sql.*;

public class DatabaseInterface {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/your_database_name";
    static final String USER = "your_username";
    static final String PASS = "your_password";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(JDBC_DRIVER);

            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Creating table...");
            stmt = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS my_table_name (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT," +
                    "name VARCHAR(255)," +
                    "age INT)";
            stmt.executeUpdate(sql);
            System.out.println("Table created successfully");

// Menu
            boolean exit = false;
            while (!exit) {
                System.out.println("\nMENU");
                System.out.println("1. Insert records");
                System.out.println("2. Display all records");
                System.out.println("3. Update a record");
                System.out.println("4. Delete a record");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = Integer.parseInt(System.console().readLine());

                switch (choice) {
                    case 1:
                        insertRecords(conn);
                        break;
                    case 2:
                        displayAllRecords(conn);
                        break;
                    case 3:
                        updateRecord(conn);
                        break;
                    case 4:
                        deleteRecord(conn);
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
 System.out.println("Invalid choice. Please enter a number from 1 to 5.");
                }
            }

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insertRecords(Connection conn) throws SQLException {
        PreparedStatement pstmt = conn.prepareStatement("INSERT INTO my_table_name (name, age) VALUES (?, ?)");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name for record " + (i + 1) + ": ");
            String name = System.console().readLine();
            System.out.print("Enter age for record " + (i + 1) + ": ");
            int age = Integer.parseInt(System.console().readLine());

            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.executeUpdate();
        }

 System.out.println("Records inserted successfully");
        pstmt.close();
    }

    public static void displayAllRecords(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM my_table_name";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age"));
        }

        rs.close();
        stmt.close();
    }

    public static void updateRecord(Connection conn) throws SQLException {
        System.out.print("Enter the ID of the record to update: ");
        int id = Integer.parseInt(System.console().readLine());
        System.out.print("Enter new name: ");
        String newName = System.console().readLine();
        System.out.print("Enter new age: ");
        int newAge = Integer.parseInt(System.console().readLine());

PreparedStatement pstmt = conn.prepareStatement("UPDATE my_table_name SET name=?, age=? WHERE id=?");
        pstmt.setString(1, newName);
        pstmt.setInt(2, newAge);
        pstmt.setInt(3, id);
        pstmt.executeUpdate();

        System.out.println("Record updated successfully");
        pstmt.close();
    }

    public static void deleteRecord(Connection conn) throws SQLException {
        System.out.print("Enter the ID of the record to delete: ");
        int id = Integer.parseInt(System.console().readLine());

        PreparedStatement pstmt = conn.prepareStatement("DELETE FROM my_table_name WHERE id=?");
        pstmt.setInt(1, id);
        pstmt.executeUpdate();

        System.out.println("Record deleted successfully");
        pstmt.close();
    }
}
