import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

  static final ArrayList<User> users = new ArrayList<>();

  public static void main(String[] args) {

    // The following line should be uncommented if the database should be saved for the first time
    // saveDatabase();
    readDatabase();
    readUsersList();
  }

  private static void readUsersList() {
    for (User user : users){
      System.out.println(user);
    }
  }

  private static void readDatabase() {
    try {
      Connection conn = DriverManager.getConnection("jdbc:h2:./src/users", "sa", "");
      Statement stmt = conn.createStatement();

      ResultSet rs = stmt.executeQuery("SELECT * FROM users");
      while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        System.out.println("id = " + id + ", name = " + name);
        users.add(new User(id, name));
      }
    }
    catch(Exception e){
      System.out.println("Problem while connection to database "+ e.getMessage());
    }
  }
  public static void saveDatabase() {
    try {
      Connection conn = DriverManager.getConnection("jdbc:h2:./src/users", "sa", "");

      Statement stmt = conn.createStatement();

      stmt.execute("CREATE TABLE users (id INT, name VARCHAR(255))");

      stmt.executeUpdate("INSERT INTO users (id, name) VALUES (1, 'John')");

      stmt.executeUpdate("INSERT INTO users (id, name) VALUES (2, 'Jane')");

      stmt.close();
      conn.close();
    }
    catch(Exception e){
      System.out.println("Problem while connecting to database "+ e.getMessage());
    }
  }
}