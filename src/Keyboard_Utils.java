import java.util.Scanner;
class Keyboard_Utils {
    Scanner in;

    Keyboard_Utils() {
        in = new Scanner(System.in);
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        return in.nextLine();
    }

    public Double getDouble(String prompt) {
        boolean again;
        Double out = 0.0;

        do {
            String input;
            again = false;
            System.out.print(prompt);
            input = in.nextLine();
            try {
                out = Double.parseDouble(input);
            } catch (Exception E) {
                System.out.println("Invalid input. Please try again...");
                again = true;
            }
        } while (again);

        return out;
    }

    public int getInt(String prompt) {
        boolean again;
        int out = 0;

        do {
            String input;
            again = false;
            System.out.print(prompt);
            input = in.nextLine();
            try {
                out = Integer.parseInt(input);
            } catch (Exception E) {
                System.out.println("Invalid input. Please try again...");
                again = true;
            }
        } while (again);

        return out;
    }
}
