package MidtermTest;

import java.util.Objects;

public abstract class Vehicle implements Steerable{
    private String productId;
    private Integer weight = null;

    public Vehicle (){}

    public Vehicle (String productId, Integer weight){
        setProductId(productId);
        setWeight(weight);
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        if (weight < 0){
            weight = null;
        }

        this.weight = weight;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(productId, vehicle.productId);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "productId='" + productId + ", weight=" + weight +
                '}';
    }

}
