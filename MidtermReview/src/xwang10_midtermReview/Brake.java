package xwang10_midtermReview;
public class Brake {

    boolean isFront;
    boolean isLeft;
    double pressure;

    public static void main(String[] args)
    {
        Brake brakeObj = new Brake(true,true);
        System.out.println(brakeObj);
    }
    public Brake(boolean bFront, boolean bLeft)
    {
        if (bFront == true)
            isFront = true;
        else
            isFront = false;

        if (bLeft == true)
            isLeft = true;
        else
            isLeft = false;

        pressure = 0;
    }

    // isReleased will see if brake pressure is 0
    boolean isReleased()
    {
        if (this.pressure == 0)
            return (true);
        else
            return false;
    }

    void apply(int pressureChange)
    {
        this.pressure += pressureChange;
    }

    double getPressure()
    {
        return this.pressure;
    }

    public String toString()
    {
        String retString;
        // Determine where the brake is and print out it's characteristics
        if (isFront)
            retString = "Front:";
        else
            retString = "Back:";

        retString += "Pressure " + getPressure() + ": ";

        if (isLeft)
            retString += "Left Side";
        else
            retString += "Right Side";

        return retString;
    }

    public void release()
    {
        pressure = 0;
    }
}


