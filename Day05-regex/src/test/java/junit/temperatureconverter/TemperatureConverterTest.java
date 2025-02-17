package junit.temperatureconverter;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


    public class TemperatureConverterTest {

        private TemperatureConverter temperatureConverter;

        @BeforeEach
        public void setUp() {
            temperatureConverter = new TemperatureConverter();
        }

        @Test
        void testCelsiusToFahrenheit() {
            assertEquals(32, temperatureConverter.celsiusToFahrenheit(0), "0°C should be 32°F.");
            assertEquals(212, temperatureConverter.celsiusToFahrenheit(100), "100°C should be 212°F.");
            assertEquals(-40, temperatureConverter.celsiusToFahrenheit(-40), "-40°C should be -40°F.");
        }

        @Test
        void testFahrenheitToCelsius() {
            assertEquals(0, temperatureConverter.fahrenheitToCelsius(32), "32°F should be 0°C.");
            assertEquals(100, temperatureConverter.fahrenheitToCelsius(212), "212°F should be 100°C.");
            assertEquals(-40, temperatureConverter.fahrenheitToCelsius(-40), "-40°F should be -40°C.");
        }

        @Test
        void testExtremeTemperatures() {
            assertEquals(1832, temperatureConverter.celsiusToFahrenheit(1000), "1000°C should be 1832°F.");

        }
    }