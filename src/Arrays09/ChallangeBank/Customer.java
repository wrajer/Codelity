package Arrays09.ChallangeBank;

import java.util.List;

public class Customer {
    private String name;
    private List<Double> transations;

    public String getName() {
        return name;
    }

    public Customer(String name, List<Double> transations) {
        this.name = name;
        this.transations = transations;
    }

    public Customer(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getTransations() {
        return transations;
    }

    public void setTransations(List<Double> transations) {
        this.transations = transations;
    }
}
