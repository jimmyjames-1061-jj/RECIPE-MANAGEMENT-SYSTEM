import java.util.List;
public class Recipe {
    private String title;
    private String instructions;
    private IngredientRecipe ingredientRecipe;
    public Recipe(String title, String instructions, IngredientRecipe ingredientRecipe) {
        this.title = title;
        this.instructions = instructions;
        this.ingredientRecipe = ingredientRecipe;
    }
    // Getters and Setters
    public String getTitle() {
        return title;
    }
    public String getInstructions() {
        return instructions;
    }
    public IngredientRecipe getIngredientRecipe() {
        return ingredientRecipe;
    }
}