package Lab1;

/**
 * @author Koki Sakai
 */

public class Model {
    public static final int INCHES_PER_FOOT = 12;
    public static final double POUNDS_PER_KG = 2.2046;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smoker;


    public Model() {
    }

    /**
     * Second constructor
     * @param firstName firstName of the model
     * @param lastName lastName of the model
     * @param height height of the model
     * @param weight weight of the model
     * @param canTravel the model can travel or not
     * @param smoker the model likes smoking or not
     */
    public Model(String firstName, String lastName, int height, double weight, boolean canTravel, boolean smoker) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setCanTravel(canTravel);
        setSmoker(smoker);
    }

    /**
     * Third constructor
     * @param firstName firstName of the model
     * @param lastName lastName of the model
     * @param height height of the model
     * @param weight weight of the model
     */
    public Model(String firstName, String lastName, int height, double weight) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        this.canTravel = true;
        this.smoker = false;
    }

    public void printDetails(){
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeight() + " inches");
        System.out.println("Weight: " + Math.round(getWeight()) + " pounds");
        if (canTravel) {
            System.out.println("Does travel ");
        } else {
            System.out.println("Does not travel ");
        }
        if (smoker) {
            System.out.println("Does smoke ");
        } else {
            System.out.println("Does not smoke ");
        }
    }

    public int calculatePayDollarsPerHour(){
        int hourlyRate = BASE_RATE_DOLLARS_PER_HOUR;
        if (TALL_INCHES < getHeight() && getWeight() < THIN_POUNDS) {
            hourlyRate += TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        }

        if (canTravel){
            hourlyRate += TRAVEL_BONUS_DOLLARS_PER_HOUR;
        }

        if (smoker){
            hourlyRate -= SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }
        return hourlyRate;
    }

    public void displayModelDetails(){
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInFeetAndInches());
        System.out.println("Weight: " + getWeight() + " pounds");
        if (canTravel) {
            System.out.println("yep ");
        } else {
            System.out.println("nope ");
        }
        if (smoker) {
            System.out.println("yep ");
        } else {
            System.out.println("nope ");
        }
        System.out.println("Hourly rate: $" + calculatePayDollarsPerHour());

    }

    /**
     *
     * @return return height
     */
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (24 < height && height < 80)  {
            this.height = height;
        }
    }

    public String getHeightInFeetAndInches(){
        String result = "";
        int feet = (int)((double)height / INCHES_PER_FOOT);
        int inch = (int)((double)height % INCHES_PER_FOOT);
        if (inch == 0){
            result = String.format("%d feet" , feet);

        } else if (inch == 1){
            result = String.format("%d feet %d inch" , feet, inch);

        } else {
            result = String.format("%d feet %d inches" , feet, inch);
        }
        return result;
    }

    public void setHeight(int feet, int height){
        if (24 < height && height < 80) {
            this.height = (feet * INCHES_PER_FOOT) + height;
        }
    }

    /**
     *
     * @return return weight
     */
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (80 < weight && weight < 280)  {
            this.weight = weight;
        }
    }

    public long getWeightKg(){
        long kg = (Math.round(weight / POUNDS_PER_KG));
        return kg;
    }

    public void setWeight(long kg){
        if (80 < weight && weight < 280) {
            this.weight = kg;
        }
    }

    /**
     *
     * @return return firstname
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (3 < firstName.length() && firstName.length() < 20)  {
            this.firstName = firstName;
        }
    }

    /**
     *
     * @return return lastname
     */
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (3 < lastName.length() && lastName.length() < 20)  {
            this.lastName = lastName;
        }
    }


    public void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }

    public void setSmoker(boolean smoker) {
        this.smoker = smoker;
    }
}
