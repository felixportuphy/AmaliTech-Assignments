 // Felix_Portuphy
public class GravityCalculator_2 {

    // The object's position after 10.0 seconds is -490.5 m.
    public static void main(String[] args) {

        double fallingTime = 10;
        double a = -9.81; // Acceleration in m/s^2
        double t = 10;    // Time in seconds
        double vi = 0;     // Initial Velocity in m/s
        double xi = 0;       // Initial Position
        double xt;        // Final Position
        xt = ((a * (t * t)) / 2) + (vi * t) + xi;
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + xt + " m.");
    }
}
