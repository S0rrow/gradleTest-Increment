package gradleTest.Increment;

public class App06 {
    public static double getDist(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        double sqDist = dx * dx + dy * dy;
        return Math.sqrt(sqDist);
    }
}
