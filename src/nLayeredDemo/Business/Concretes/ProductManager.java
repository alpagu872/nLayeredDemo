package nLayeredDemo.Business.Concretes;

import nLayeredDemo.Core.LoggerService;
import nLayeredDemo.jLogger.jLoggerManager;
import nLayeredDemo.Business.Abstracts.ProductService;
import nLayeredDemo.DataAcces.Abstracts.ProductDao;
import nLayeredDemo.Entities.Concretes.Product;


import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao; //indepency injection
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {


        //iş kodları

        if (product.getCategoryId() == 1) {
            System.out.println("Bu kategoride ürün kabul edilmiyor.");
            return;
        }

        this.productDao.add(product);
        this.loggerService.logToSystem("Ürün eklendi. " + product.getName());



    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
