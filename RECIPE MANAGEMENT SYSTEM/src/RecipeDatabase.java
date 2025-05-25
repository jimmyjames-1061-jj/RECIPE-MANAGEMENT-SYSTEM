import java.util.ArrayList;
import java.util.List;
public class RecipeDatabase {
    private List<Recipe> recipes;
    public RecipeDatabase() {
        this.recipes = new ArrayList<>();
    }
    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }
    public List<Recipe> getRecipes() {
        return recipes;
    }
}