package MidtermTest;

public class Car extends Vehicle implements Steerable{
    private boolean isLeftHandDriving;

    public Car(){}

    public Car(String productId, Integer weight, boolean isLeftHandDriving){
        super(productId, weight);
        setLeftHandDriving(isLeftHandDriving);
    }

    @Override
    public void accelerate() {
        if (this.getWeight() == null){
            System.out.println("there’s something wrong");
        } else {
            System.out.println("fire pistons, turn wheels");
        }
    }

    @Override
    public void steerLeft() {
        System.out.println("turn wheels left");
    }

    @Override
    public void steerRight() {
        System.out.println("turn wheels right");
    }

    @Override
    public String toString() {
        return "Car{" +
                "productId='" + getProductId() + ", weight=" + getWeight() +
                ", isLeftHandDriving=" + isLeftHandDriving +
                '}';
    }



    public void setLeftHandDriving(boolean leftHandDriving) {
        isLeftHandDriving = leftHandDriving;
    }
}
