import java.util.function.IntBinaryOperator;

class ApplePieRecipe {
    Ingredient ongezoutenBoter = new Ingredient(200.0, "gram", "ongezouten boter");
    Ingredient witteSuiker = new Ingredient(200, "gram", "witte basterd suiker");
    Ingredient zelfrijzendBakmeel = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient ei = new Ingredient(1, "stuk", "ei");
    Ingredient vanillesuiker = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient zout = new Ingredient(1, "snuf", "zout");
    Ingredient zoetZureAppels = new Ingredient(1.5, "kilo", "zoetzure appels");
    Ingredient kristalSuiker = new Ingredient(75, "gram", "kristal suiker");
    Ingredient kaneel = new Ingredient(3, "theelepels", "kaneel");
    Ingredient paneerMeel = new Ingredient(15, "gram", "paneermeel");


//200 gram ongezouten roomboter 200 gram witte bastard suiker 400 gram zelfrijzend bakmeel 1 stuk(s) ei 8 gram vanillesuiker 1 snuf zout 1.5 kilo zoetzure appels
// 75 gram kristal suiker 3 theelepels kaneel 15 gram paneermeel Stappen:

    public ApplePieRecipe() {
        this.ongezoutenBoter = new Ingredient(200, "gram", "ongezouten roomboter");
    }

    public void printIngredients() {
        System.out.println(ongezoutenBoter.getAmount());
        System.out.println();
    }

}
