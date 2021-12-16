package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Productservice implements IProductService{
    private static final Map<Integer,Product> productMap = new HashMap<>();


    static {
     productMap.put(1, new Product(1,"Toy",10086));
     productMap.put(2, new Product(2,"TV",1276));
     productMap.put(3, new Product(3,"ĐT",768));
     productMap.put(4, new Product(4,"May giặt",1785));
     productMap.put(5, new Product(5,"Noi com",65760));

    }



    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
       return productMap.get(id);
    }

    @Override
    public void update(int id,Product product) {
      productMap.put(id,product);
    }

    @Override
    public void remove(int id) {
      productMap.remove(id);
    }

    @Override
    public List<Product> findByName(String name) {
        return (List<Product>) productMap.get(name);
}
}
