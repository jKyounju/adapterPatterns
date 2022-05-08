package CreatationalPattern.BuilderPattern;
import product.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComplexObject {

    private List<Product> children = new ArrayList<>();

    public String getParts() {
        Iterator<Product> i = children.iterator();
        String str ="Complex Objetct made up of";
        while(i.hasNext()) {
            str = i.next().getName();
        }
        return str;
    }

    public void add(Product product) {
        children.add(product);
    }

    public Iterator<Product> iterator() {
        return children.iterator();
    }
}
