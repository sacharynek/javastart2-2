public enum UNITS {
    ml("mililitre", "ml")
    ,g("gram", "g")
    ,teaSpoon("teaspoon", "ts")
    ,tableSpoon("tablespoon", "tbs")
    ,half("half","h")
    ,amount("amount", "am");

    String printName;
    String abbreviation;

    private UNITS(String printName, String abbreviation){
        this.printName = printName;
        this.abbreviation = abbreviation;
    }

    public String getPrintName() {
        return printName;
    }

    public void setPrintName(String printName) {
        this.printName = printName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @Override
    public String toString() {
        return  printName ;
    }
}
