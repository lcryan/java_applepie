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

    public void printHeadLine() {
        System.out.println("Welkom! Jij wilde een lekker Nederlandse Appeltaart bakken, toch ? Daar komt die : ");
    }

    public void printIngredientHeadline() {
        System.out.println("Ingrediënten: ");
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

    public void stepThreeAddFlour() {
        System.out.println("• Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void stepFourPeelApples() {
        System.out.println("• Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void stepFiveGreaseSpringform() {
        System.out.println("• Vet de springvorm in en bestrooi deze met bloem.");
    }

    public void stepSixDoughInSpringform() {
        System.out.println("• Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void stepSevenAddAppelsAndCinnamon() {
        System.out.println("• Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void stepEightMakeDoughGrid() {
        System.out.println("• Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed");
    }

    public void stepNineLayOutDoughGrid() {
        System.out.println("• Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken ");
    }

    public void stepTenPieIntoOven() {
        System.out.println("• Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

    public void printRecipeSteps() {
        stepOneHeatUpOven();
        stepTwoAddEgg();
        stepThreeAddFlour();
        stepFourPeelApples();
        stepFiveGreaseSpringform();
        stepSixDoughInSpringform();
        stepSevenAddAppelsAndCinnamon();
        stepEightMakeDoughGrid();
        stepNineLayOutDoughGrid();
        stepTenPieIntoOven();
    }
}

