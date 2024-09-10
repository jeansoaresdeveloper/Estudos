import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Seller sellerUm = new Seller();
        SellerProduct camiseta = new SellerProduct(1L, "Camiseta", BigDecimal.valueOf(10));
        SellerProduct caneta = new SellerProduct(2L, "Caneta", BigDecimal.valueOf(6.60));
        sellerUm.addProducts(List.of(camiseta, caneta));


        Seller sellerDois = new Seller();
        SellerProduct carro = new SellerProduct(3L, "Carro", BigDecimal.valueOf(49));
        SellerProduct moto = new SellerProduct(4L, "Moto", BigDecimal.valueOf(30));
        sellerDois.addProducts(List.of(carro, moto));

        Mediator mediator = new Mediator();
        mediator.addSellers(List.of(sellerUm, sellerDois));

        Buyer buyer = new Buyer(mediator);
        buyer.buy(1L);
        buyer.buy(2L);
        buyer.viewProducts();

    }

}
