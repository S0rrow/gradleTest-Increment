package gradleTest.Increment;

public class App08 {
    public static double teatime(int armor, double degree)
    {
        return armor * 1/Math.cos(degree);
    }
    // canPenetrate(105, 260, 180, 60) = false;
    public static boolean canPenetrate(int gunSize, int pen, int armor, double degree){
        //if(gunSize/3 >= armor) return true;
        return pen >= teatime(armor, degree);
    }
}
