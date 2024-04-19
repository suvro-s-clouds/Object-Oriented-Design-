/**
 * Title: Java program demonstrating Dependency Inversion Principle (DIP)
 * Author: [Suvro Dev Mojumder , Student ID : 220237 , Discipline - CSE , Khulna University ]
 */
/**
 * Interface representing any class that provides weather information.
 */
interface WeatherProvider {
    /**
     * Retrieves current weather information.
     *
     * @return Current weather conditions.
     */
    String getWeather();
}

/**
 * Class representing a Weather Station that provides weather information.
 */
class WeatherStation implements WeatherProvider {

    /**
     * Retrieves current weather information from the weather station.
     *
     * @return Current weather conditions.
     */
    @Override
    public String getWeather() {
        // Simulate fetching weather data from the weather station
        return "Sunny";
    }
}

/**
 * Class responsible for displaying weather information.
 */
class WeatherDisplay {

    /**
     * Displays the current weather information.
     *
     * @param weatherProvider Object providing weather information.
     */
    public void displayWeather(WeatherProvider weatherProvider) {
        String weather = weatherProvider.getWeather();
        System.out.println("Current Weather: " + weather);
    }
}

/**
 * Main class to demonstrate the usage of WeatherDisplay with dependency inversion.
 */
public class Main {
    /**
     * The main entry point of the program.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create a WeatherStation instance
        WeatherProvider weatherStation = new WeatherStation();

        // Create a WeatherDisplay instance
        WeatherDisplay weatherDisplay = new WeatherDisplay();

        // Use WeatherDisplay to display weather information
        weatherDisplay.displayWeather(weatherStation);
    }
}
