import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Drink {

    private boolean nonAlcoholic;
    private String name;
    private int price;
    private List<Ingredient> ingredients;

    public Drink(boolean nonAlcoholic, String name, int price, List<Ingredient> ingredients) {
        this.nonAlcoholic = nonAlcoholic;
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public boolean isNonAlcoholic() {
        return nonAlcoholic;
    }

    public void setNonAlcoholic(boolean nonAlcoholic) {
        this.nonAlcoholic = nonAlcoholic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public int getZlotyFromPrice() {
        return price / 100;
    }

    public int getGroszFromPrice() {
        return price % 100;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public String getDrinkCapacity() {

        Map ingredientSummary = new HashMap<UNITS, Integer>();
        StringBuilder sb = new StringBuilder();

        for (UNITS unit : UNITS.values()) {
            ingredientSummary.put(unit, 0);
        }

        for (Ingredient ingredient : ingredients) {
            Integer count = ingredientSummary.containsKey(ingredient.getUnit()) ? (Integer) ingredientSummary.get(ingredient.getUnit()) : 0;
            ingredientSummary.put(ingredient.getUnit(), count + ingredient.getAmount());
        }

        //sb.append("\n Drink Size");

        for (Object unit : ingredientSummary.keySet()) {
            String unitName = ((UNITS) unit).getPrintName();
            Integer amount = (Integer) ingredientSummary.get((UNITS) unit);
            sb.append("\n "+unitName + " =  " + amount);
        }

        return sb.toString();

    }

    @Override
    public String toString() {
        return "Drink{" +
                "nonAlcoholic=" + nonAlcoholic +
                ", name='" + name + '\'' +
                ", price=" + getZlotyFromPrice() + "." + getGroszFromPrice() +
                " , ingredients=" + ingredients +
                " ,\n Drink Size"+getDrinkCapacity() +
                '}';
    }
}
