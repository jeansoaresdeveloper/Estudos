import Components.ProductComponent;
import Composite.ProductComposed;
import Composite.ProductLeaf;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ProductLeaf tShirt = new ProductLeaf("tShirt", BigDecimal.valueOf(12.50));
        ProductLeaf pen = new ProductLeaf("Pen", BigDecimal.valueOf(5.50));
        ProductLeaf pencil = new ProductLeaf("Pencil", BigDecimal.valueOf(7.60));

        ProductComposed productComposed = new ProductComposed();
        productComposed.add(List.of(tShirt, pen, pencil));

        ProductLeaf tablet = new ProductLeaf("Tablet", BigDecimal.valueOf(86.50));
        ProductLeaf kindle = new ProductLeaf("Kindle", BigDecimal.valueOf(70.50));

        ProductComposed anotherProductComposed = new ProductComposed();
        anotherProductComposed.add(List.of(tablet, kindle));
        productComposed.add(List.of(anotherProductComposed));

        System.out.println(productComposed.getPrice());


    }

}
