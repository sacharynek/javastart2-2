public class Ingredient {

    private String name;
    private int amount;
    private UNITS unit;


    public Ingredient(String name, int amount, UNITS unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public UNITS getUnit() {
        return unit;
    }

    public void setUnit(UNITS unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "    \nIngredient{" +
                "name = '" + name + '\'' +
                ", amount = " + amount +
                ", unit = " + unit +
                '}';
    }
}
