package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

       if(partRepository.count() == 0 && productRepository.count() == 0) {
            OutsourcedPart o1 = new OutsourcedPart();
            o1.setCompanyName("Rom&nd");
            o1.setName("Glasting Lip Tint");
            o1.setInv(50);
            o1.setPrice(25.0);
            o1.setId(100L);
            o1.setMinInv(10);
            o1.setMaxInv(100);
            partRepository.save(o1);
            OutsourcedPart thePart1 = null;


            OutsourcedPart o2 = new OutsourcedPart();
            o2.setCompanyName("CLIO");
            o2.setName("Mesh Cover Cushion");
            o2.setInv(37);
            o2.setPrice(30.0);
            o2.setId(200L);
            o2.setMinInv(20);
            o2.setMaxInv(200);
            partRepository.save(o2);
            OutsourcedPart thePart2 = null;

            OutsourcedPart o3 = new OutsourcedPart();
            o3.setCompanyName("Dasique");
            o3.setName("Coffee Eye Shadow");
            o3.setInv(45);
            o3.setPrice(35.0);
            o3.setId(300L);
            o3.setMinInv(30);
            o3.setMaxInv(300);
            partRepository.save(o3);
            OutsourcedPart thePart3 = null;

            OutsourcedPart o4 = new OutsourcedPart();
            o4.setCompanyName("Too Cool for School");
            o4.setName("Art Class Contour");
            o4.setInv(68);
            o4.setPrice(19.0);
            o4.setId(400L);
            o4.setMinInv(40);
            o4.setMaxInv(240);
            partRepository.save(o4);
            OutsourcedPart thePart4 = null;

            OutsourcedPart o5 = new OutsourcedPart();
            o5.setCompanyName("Amuse");
            o5.setName("Angel Blusher");
            o5.setInv(77);
            o5.setPrice(11.00);
            o5.setId(40L);
            o5.setMinInv(50);
            o5.setMaxInv(500);
            partRepository.save(o5);
            OutsourcedPart thePart5 = null;

            Product douyin = new Product("Douyin Deluxe", 80.0, 30);
            Product kbeauty = new Product("K-beauty Essentials", 85.0, 40);
            Product igari = new Product("Igari Kit", 70.0, 15);
            Product glam = new Product("Ultimate Glam", 100.0, 10);
            Product cleangirl = new Product("Clean Girl Starter Pack", 60.0, 5);

            productRepository.save(douyin);
            productRepository.save(kbeauty);
            productRepository.save(igari);
            productRepository.save(glam);
            productRepository.save(cleangirl);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
