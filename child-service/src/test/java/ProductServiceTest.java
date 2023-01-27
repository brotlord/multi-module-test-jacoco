import org.example.model.Product;
import org.example.service.ProductService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductServiceTest {

    @Test
    void getNameOfProduct(){
        Product p1 = new Product(2, "Bla",21);
        ProductService service = new ProductService();
        service.insertProduct(p1);

        String nameOfProduct = service.getAllProducts().get(0).getName();

        assertEquals("Lars Test", nameOfProduct);
    }
}
