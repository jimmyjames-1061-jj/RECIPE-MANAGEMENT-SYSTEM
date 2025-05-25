public class Main {
    public static void main(String[] args) {
        RecipeDatabase recipeDatabase = new RecipeDatabase();
        RecipeManagerGUI gui = new RecipeManagerGUI(recipeDatabase);
        gui.display();
    }
}