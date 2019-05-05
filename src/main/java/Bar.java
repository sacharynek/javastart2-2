import java.util.ArrayList;
import java.util.List;

public class Bar {

    public static void main(String[] args) {
        Ingredient vodka = new Ingredient("vodka", 20, UNITS.ml);
        Ingredient tequila = new Ingredient("tequilla", 20, UNITS.ml);
        Ingredient brandy = new Ingredient("brandy", 20, UNITS.ml);
        Ingredient whiteRum = new Ingredient("White Rum", 20, UNITS.ml);
        Ingredient gin = new Ingredient("gin", 20, UNITS.ml);
        Ingredient tripleSec = new Ingredient("triple sec", 20, UNITS.ml);
        Ingredient limeJuice = new Ingredient("lime juice", 30, UNITS.ml);
        Ingredient lemonJuice = new Ingredient("lemon juice", 30, UNITS.ml);
        Ingredient cola = new Ingredient("cola", 150, UNITS.ml);
        Ingredient iceCubes = new Ingredient("ice cube", 6, UNITS.amount);

        List<Ingredient> longIslandIceTeaIngredients = new ArrayList<Ingredient>();
        longIslandIceTeaIngredients.add(vodka);
        longIslandIceTeaIngredients.add(tequila);
        longIslandIceTeaIngredients.add(whiteRum);
        longIslandIceTeaIngredients.add(gin);
        longIslandIceTeaIngredients.add(limeJuice);
        longIslandIceTeaIngredients.add(cola);
        longIslandIceTeaIngredients.add(iceCubes);

        Drink longIslandIceTea = new Drink(false, "Long Island Ice Tea", 3000, longIslandIceTeaIngredients);

        System.out.println("longIslandIceTea = " + longIslandIceTea);


    }
}
