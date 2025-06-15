import java.util.logging.Logger;

public class App {

    // Create a logger for this class
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Hello, Jenkins + SonarQube!");
    }
}
