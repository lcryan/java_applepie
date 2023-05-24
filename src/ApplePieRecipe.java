import java.util.function.IntBinaryOperator;

class ApplePieRecipe {
    Ingredient butter = new Ingredient(200.0, "gram", "ongezouten boter");
    Ingredient casterSugar = new Ingredient(200, "gram", "witte basterd suiker");
    Ingredient selfrisingFlour = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient egg = new Ingredient(1, "stuk", "ei");
    Ingredient vanillaSugar = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient salt = new Ingredient(1, "snuf", "zout");
    Ingredient apples = new Ingredient(1.5, "kilo", "zoetzure appels");
    Ingredient sugar = new Ingredient(75, "gram", "kristal suiker");
    Ingredient cinnamon = new Ingredient(3, "theelepels", "kaneel");
    Ingredient breadcrumbs = new Ingredient(15, "gram", "paneermeel");


//200 gram ongezouten roomboter 200 gram witte bastard suiker 400 gram zelfrijzend bakmeel 1 stuk(s) ei 8 gram vanillesuiker 1 snuf zout 1.5 kilo zoetzure appels
// 75 gram kristal suiker 3 theelepels kaneel 15 gram paneermeel Stappen:

    public ApplePieRecipe() {
        this.butter = new Ingredient(200, "gram", "ongezouten roomboter");
        this.casterSugar = new Ingredient(200, "gram", "witte basterd suiker");
        this.selfrisingFlour = new Ingredient(400, "gram", "zelfrijzend bakmeel");
        this.egg = new Ingredient(1, "stuk", "ei");
        this.vanillaSugar = new Ingredient(8, "gram", "vanillesuiker");
        this.salt = new Ingredient(1, "snuf", "zout");
        this.apples = new Ingredient(1.5, "kilo", "zoetzure appels");
        this.sugar = new Ingredient(75, "gram", "kristal suiker");
        this.cinnamon = new Ingredient(3, "theelepels", "kaneel");
        this.breadcrumbs = new Ingredient(15, "gram", "paneermeel");

    }

    public void printIngredients() {
        System.out.printf(butter.getAmount()+ " " + butter.getUnit() + " " + butter.getName() + "%n");
        System.out.println();
    }

}
