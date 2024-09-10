import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CustomerDataParserTxt extends CustomerDataParser{

    private static final String BY_SPACE = "\\s+";

    public CustomerDataParserTxt(String filePath) {
        super(filePath);
    }

    @Override
    protected List<Customer> parseData() {

        final List<Customer> customers = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(getFilePath()));
            String line;

            while ((line = bufferedReader.readLine()) != null) {

                String[] parts = line.split(BY_SPACE);
                String name = parts[0];
                String age = parts[1];
                String cpf = parts[2];

                customers.add(new Customer(name, age, cpf));
            }

            bufferedReader.close();

        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo." + e.getMessage());
        }

        return customers;
    }
}
