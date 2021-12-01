package unit_5.in_class.m_z;
// Zach and Miheer
// Mr.Nichols
// Period 1
// finds offensive and defensive ratings and combines them under this class
public class Stats
{
    // instance variables
    private double offRating;
    private double defRating;

    // full constructor
    public Stats(double offRating, double defRating)
    {
        this.offRating = offRating;
        this.defRating = defRating;
    }

    // getters and setters
    public double getOffRating()
    {
        return offRating;
    }

    public void setOffRating(double offRating)
    {
        this.offRating = offRating;
    }

    public double getDefRating()
    {
        return defRating;
    }

    public void setDefRating(double defRating)
    {
        this.defRating = defRating;
    }
}
