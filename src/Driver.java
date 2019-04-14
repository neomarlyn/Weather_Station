
public class Driver {
    public static void main(String[] args) {
        Keyboard_Utils ku = new Keyboard_Utils();
        WeatherStation ws;

        int valueCount = 0;

        do {
            valueCount = ku.getInt("Enter the # of barometric pressures you will type: ");
            if (valueCount < 1) {
                System.out.println("Invalid input. Please try again...");
            }
        } while(valueCount < 1);

        ws = new WeatherStation(valueCount);


        int menuChoice = 0;

        do {

            do {
                menuChoice = ku.getInt(String.format("Enter a barometric pressure value [up to %d] (1) Add (2) Quit ?  ", valueCount));
            } while (menuChoice < 1 || menuChoice > 2);

            if (menuChoice == 1) {
                boolean again;
                do {
                    again = false;
                    double value = ku.getDouble("Enter the barometric pressure value: ");
                    try {
                        ws.addBarometricPressure(value);
                    } catch (Exception e) {
                        again = true;
                        System.out.println("Invalid Barometric Pressure");
                    }
                } while (again);
            }

        } while (menuChoice != 2 && ws.getCurrentCount() < ws.getMaxCount());

        System.out.println(ws.toString());
    }

}
