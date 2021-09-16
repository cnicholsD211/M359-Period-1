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
