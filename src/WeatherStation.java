import java.util.Arrays;

public class WeatherStation {
    private static int DEFAULT_MAX_COUNT = 5;
    private int MAX_COUNT;
    private double[] pressures;
    private int count;

    public WeatherStation() {
       this(DEFAULT_MAX_COUNT);
    }
    public WeatherStation(int MAX_COUNT){
        this.MAX_COUNT = MAX_COUNT;
        count = 0;
        pressures = new double[MAX_COUNT];
    }
    public void addBarometricPressure(double pressure) {
        if (pressure < 25.69 || pressure > 32.005) {
            throw new RuntimeException("Invalid Barometric Pressure");
        }
        if (count < MAX_COUNT) {
            pressures[count] = pressure;
            count++;
        }
    }
    public int getMaxCount() {
        return MAX_COUNT;
    }
    public int getCurrentCount() {
        return count;
    }

    @Override
    public String toString() {
        return "WeatherStation{" +
                "MAX_COUNT=" + MAX_COUNT +
                ", count=" + count +
                ", pressures=" + Arrays.toString(pressures) +
                '}';
    }
}
