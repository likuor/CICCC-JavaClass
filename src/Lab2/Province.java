package Lab2;

public class Province {
    String DEFAULT_PROVINCE = "British Columbia";
    String DEFAULT_CAPITAL = "Victoria";
    long DEFAULT_POPULATION = 4648055;

    private String name;
    private String capital;
    private long population;

    public Province() {
        this.name = DEFAULT_PROVINCE;
        this.capital = DEFAULT_CAPITAL;
        this.population = DEFAULT_POPULATION;
    }

    public Province(String name, String capital, long population) {
        if (isValidPopulation(population) && (isValidProvince(name))
                && (isValidCapitalCity(capital))) {
            this.name = name;
            this.capital = capital;
            this.population = population;
        } else {
            this.population = DEFAULT_POPULATION;
            this.name = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
        }
    }

    public String getDetails(){
        String result = String.format("The capital of %s (population. %d) is %s." , getName(), getPopulation(), getCapital());
        return result;
    }

    private boolean isValidProvince(String name) {
        boolean result = false;
        String [] canadianProvince = new String[]{
                "Quebec",
                "Nova Scotia",
                "New Brunswick",
                "Manitoba",
                "British Columbia",
                "Prince Edward Island",
                "Saskatchewan",
                "Alberta",
                "Newfoundland and Labrador",
                "Ontario",
        };

        for (int i = 0; i < canadianProvince.length; i++){
            if(name == canadianProvince[i]){
                result = true;
            }
        }
        return result;
    }

    private boolean isValidCapitalCity(String capital) {
        boolean result = false;
        String [] canadianCapitals = new String[]{
                "Quebec City",
                "Halifax",
                "Fredericton",
                "Winnipeg",
                "Victoria",
                "Charlottetown",
                "Regina",
                "Edmonton",
                "St. John's",
                "Toronto",
        };

        for (int i = 0; i < canadianCapitals.length; i++){
            if(name == canadianCapitals[i]){
                result = true;
            }
        }
        return result;
    }


    private boolean isValidPopulation(long population) {
        boolean result = true;
        long min = 30000;
        long max = 15000000;

        if (min < population && population < max){
            result = false;
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
