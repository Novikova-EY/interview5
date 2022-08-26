import org.flywaydb.core.Flyway;

public class App {
    public static void main(String[] args) {
        Flyway database = Flyway.configure()
                .dataSource("jdbc:mysql://localhost/hibernate_demo", "root", "Novikova2010")
                .load();
        database.migrate();
    }
}
