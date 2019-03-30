package Arrays09.ChallangeBank;

import java.util.ArrayList;
import java.util.List;

public class Branch {
    private List<Customer> customerList = new ArrayList();
    private Double init;

    public Branch(Double init) {
        this.init = init;
    }

    public Branch() {
    }

    public void addCustomer(Customer customer) {

        this.customerList.add(customer);
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}
