package nLayeredDemo;

import nLayeredDemo.Business.Abstracts.ProductService;
import nLayeredDemo.Business.Concretes.ProductManager;
import nLayeredDemo.Core.JLoggerManagerAdapter;
import nLayeredDemo.DataAcces.Concretes.AbcProductDao;
import nLayeredDemo.DataAcces.Concretes.HibernateProductDao;
import nLayeredDemo.Entities.Concretes.Product;
import nLayeredDemo.jLogger.jLoggerManager;
public class Main {
    public static void main(String[] args) {

        //Entityler hariç newleme yapıyorsanız ilerde sorun yaşayacaksınız. -Engin DEMİROĞ

        Product product1 = new Product(1,2,"Laptop",2000,20);


        //  TODO: Spring IoC ile çözülecek.
        ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());


        productService.add(product1);


    }
}