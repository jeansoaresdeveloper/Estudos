package Components;

import java.util.List;

public interface ProductComponent extends ProductComponentLeaf {

    void add(List<ProductComponentLeaf> component);
    void remove(ProductComponentLeaf component);

    List<ProductComponentLeaf> getChilds();

}
