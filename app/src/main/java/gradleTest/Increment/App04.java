package gradleTest.Increment;

public class App04 {
    public static double getAngle(int x1, int y1, int x2, int y2)
    {
        int dx = x2 - x1;
        int dy = y2 - y1;
        //double d = dx/dy;
        double angle = Math.atan2(dy, dx);
        //double angle = Math.atan(d);
        return angle;
    }
}
