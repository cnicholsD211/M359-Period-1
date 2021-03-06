package unit_3.in_class;

public class Pizza
{
    // instance variables
    private String store;
    private int inches, numToppings;
    private boolean isDeepDish;

    // full constructor
    public Pizza(String aStore, int numInches, int numberToppings, boolean deepDish)
    {
        store = aStore;
        inches = numInches;
        numToppings = numberToppings;
        isDeepDish = deepDish;
    }

    // default constructor
    public Pizza()
    {
        store = "N/A";
        inches = 8;
        numToppings = 0;
        isDeepDish = false;
    }

    // .equals method
    // same size, same toppings, same type
    // COMPOUND COMPARISONS: and (&&) or (||)
    public boolean equals(Pizza otherPizza)
    {
        if (this.inches == otherPizza.getInches() && this.numToppings == otherPizza.getNumToppings() && this.isDeepDish == otherPizza.isDeepDish())
        {
            return true;
        }
        else // otherwise
        {
            return false;
        }
    }

    // compareTo() via size
    // this.compareTo(otherPizza)
    public int compareTo(Pizza otherPizza) {
        if (this.getInches() < otherPizza.getInches()) // in order from left to right
            return -1;
        else if (this.getInches() > otherPizza.getInches()) // out of order from left to right
            return 1;
        else
            return 0;
    }

    // toString()
    public String toString(){
        String output = "";
        output += store + " Pizza\n";
        output += "\tNumber of toppings:\t" + numToppings + "\n";
        output += "\tSize of pizza:\t\t" + inches + "\n";
        output += "\tIs a deep dish:\t\t" + isDeepDish + "\n";
        return output;
    }

    // getters and setters
    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }

    public boolean isDeepDish() {
        return isDeepDish;
    }

    public void setDeepDish(boolean deepDish) {
        isDeepDish = deepDish;
    }
}
