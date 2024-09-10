import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class CustomerDataParser {

    private List<Customer> customers = new ArrayList<Customer>();

    private final String filePath;

    public CustomerDataParser(String filePath) {
        this.filePath = filePath;
    }

    public final void fixCustomerData() {
        customers = parseData();
        customers = fixCpf();
    }

    private List<Customer> fixCpf() {
        return customers.stream()
                .peek(Customer::cleanCpf)
                .collect(Collectors.toList());
    }

    protected abstract List<Customer> parseData();

    public List<Customer> getCustomers() {
        return customers;
    }

    public String getFilePath() {
        return filePath;
    }

    public void showCustomers() {
        customers.forEach(System.out::println);
    }
}
