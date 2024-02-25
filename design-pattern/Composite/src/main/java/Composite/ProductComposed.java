package Composite;

import Components.ProductComponent;
import Components.ProductComponentLeaf;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductComposed implements ProductComponent {

    private final List<ProductComponentLeaf> children = new ArrayList<ProductComponentLeaf>();

    public void add(List<ProductComponentLeaf> component) {
        children.addAll(component);
    }

    public void remove(ProductComponentLeaf component) {
        children.remove(component);
    }

    public List<ProductComponentLeaf> getChilds() {
        return children;
    }

    public BigDecimal getPrice() {
        return children.stream()
                .map(ProductComponentLeaf::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
