public class Main {

    public static void main(String[] args) {

        String caminho = "C:\\Users\\user\\Documents\\Estudos-Developer\\Estudos\\design-pattern\\template-method\\src\\main\\java\\customer.txt";
        CustomerDataParserTxt customerDataParserTxt = new CustomerDataParserTxt(caminho);

        customerDataParserTxt.fixCustomerData();
        customerDataParserTxt.showCustomers();


    }
}
