public class Main {

    public static void main(String[] args) {
        ApplePieRecipe dutchApplePie = new ApplePieRecipe();
        CocktailRecipe piscoSourPeru = new CocktailRecipe();
        dutchApplePie.printHeadLine();
        System.out.println(" ");
        dutchApplePie.printIngredientHeadline();
        dutchApplePie.printIngredients();
        System.out.println(" ");
        dutchApplePie.printRecipeSteps();
    }
}
