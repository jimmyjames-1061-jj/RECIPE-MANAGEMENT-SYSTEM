import java.util.List;
public class IngredientRecipe {
    private List<Ingredient> ingredients;
    public IngredientRecipe(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
    public List<Ingredient> getIngredients() {
        return ingredients;
    }
    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }
}