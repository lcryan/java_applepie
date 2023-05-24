class Ingredient {
    double amount;
    String unit;
    String name;

    public Ingredient() {

    }
    public Ingredient(double amount, String unit, String name) {
        this.amount = amount;
        this.name = name;
        this.unit = unit;
    }

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


