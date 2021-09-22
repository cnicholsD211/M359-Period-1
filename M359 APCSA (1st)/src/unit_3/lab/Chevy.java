package unit_3.lab;

public class Chevy
{
    // instance variables
    private int year, miles;
    private double price, mpg;
    private String model;
    private boolean hasLuxuryPkg, has4WDPkg, hasSportsPkg;
    private final String MAKE = "Chevrolet";

    // default constructor
    public Chevy()
    {
        this.year = 2021;
        this.miles = 0;
        this.mpg = 35;
        this.price = 16000;
        this.model = "Spark";
        this.hasLuxuryPkg = false;
        this.has4WDPkg = false;
        this.hasSportsPkg = false;
    }

    // full constructor
    public Chevy(int year, int miles, double mpg, double price, String model, boolean hasLuxuryPkg, boolean has4WDPkg, boolean hasSportsPkg) {
        this.year = year;
        this.miles = miles;
        this.mpg = mpg;
        this.price = price;
        this.model = model;
        this.hasLuxuryPkg = hasLuxuryPkg;
        this.has4WDPkg = has4WDPkg;
        this.hasSportsPkg = hasSportsPkg;
    }

    // toString
    public String toString() {
        String output = "";
        output += year + " " + MAKE + " " + this.model + "\n";
        output += "\tPRICE:\t\t\t\t$" + calcPrice() + "\n";
        output += "\tMILES:\t\t\t\t" + miles + "\n";
        output += "\tFUEL EFFICIENCY:\t" + mpg + " mpg\n";
        output += "\tPACKAGES:\n";

        // package additions
        if (hasLuxuryPkg)
            output += "\t\t- Luxury Package\n";
        if (has4WDPkg)
            output += "\t\t- 4WD Package\n";
        if (hasSportsPkg)
            output += "\t\t- Sports Package\n";
        if (!hasSportsPkg && !has4WDPkg && !hasLuxuryPkg)
            output += "\t\t- None\n";
        return output;
    }

    // compareTo via year
    public int compareTo(Chevy otherChevy)
    {
        if (this.price < otherChevy.price)
            return -1;
        else if (this.price > otherChevy.price)
            return 1;
        else
            return 0;
    }

    // equals via year and model
    public boolean equals(Chevy otherCar)
    {

        if (this.model.equals(otherCar.model) && (200 < this.miles == 200 < otherCar.miles))
            return true;
        else
            return false;
    }

    // calcPrice
    public double calcPrice()
    {
        if (hasLuxuryPkg)
            this.price *= 1.20;
        if (has4WDPkg)
            this.price += 3500;
        if (hasSportsPkg) {
            this.price *= 1.15;
            this.mpg *= 0.8;
        }
        return price;
    }

    // getters and setters
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMake() {
        return MAKE;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isHasLuxuryPkg() {
        return hasLuxuryPkg;
    }

    public void setHasLuxuryPkg(boolean hasLuxuryPkg) {
        this.hasLuxuryPkg = hasLuxuryPkg;
    }

    public boolean isHas4WDPkg() {
        return has4WDPkg;
    }

    public void setHas4WDPkg(boolean has4WDPkg) {
        this.has4WDPkg = has4WDPkg;
    }

    public boolean isHasSportsPkg() {
        return hasSportsPkg;
    }

    public void setHasSportsPkg(boolean hasSportsPkg) {
        this.hasSportsPkg = hasSportsPkg;
    }
}
