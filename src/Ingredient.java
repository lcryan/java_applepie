class Ingredient {
    double amount;
    String unit;
    String name;

    // 1. first define instances - see above !
    public Ingredient() {

    }

    public Ingredient(double amount, String unit, String name) {
        this.amount = amount;
        this.name = name;
        this.unit = unit;
        // 2. then declare them as the instances you want to use - do you say this like that ???
    }


    //3. set getters and setters to be able to pass through the parameters in class applepie with the actual ingredients that are going to
    //be printed out.
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

}


