import com.sun.jdi.event.StepEvent;

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
        System.out.printf("• " + butter.getAmount() + " " + butter.getUnit() + " " + butter.getName() + "%n");
        System.out.println("• " + casterSugar.getAmount() + " " + casterSugar.getUnit() + " " + casterSugar.getName());
        System.out.println("• " + selfrisingFlour.getAmount() + " " + selfrisingFlour.getUnit() + " " + selfrisingFlour.getName());
        System.out.println("• " + egg.getAmount() + " " + egg.getUnit() + " " + egg.getName());
        System.out.println("• " + vanillaSugar.getAmount() + " " + vanillaSugar.getUnit() + " " + vanillaSugar.getName());
        System.out.println("• " + salt.getAmount() + " " + salt.getUnit() + " " + salt.getName());
        System.out.println("• " + apples.getAmount() + " " + apples.getUnit() + " " + apples.getName());
        System.out.println("• " + sugar.getAmount() + " " + sugar.getUnit() + " " + sugar.getName());
        System.out.println("• " + cinnamon.getAmount() + " " + cinnamon.getUnit() + " " + cinnamon.getName());
        System.out.println("• " + breadcrumbs.getAmount() + " " + breadcrumbs.getUnit() + " " + breadcrumbs.getName());
        System.out.println();    // this maybe could work out as a space between the lines ? 
    }

    public void stepOneHeatUpOven() {
        System.out.println("• Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void stepTwoAddEgg() {
        System.out.println("• Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart");
    }

    public void stepThree

    public void printRecipeSteps() {
        stepOneHeatUpOven();
        stepTwoAddEgg();

    }

}
