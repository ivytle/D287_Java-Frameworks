package com.example.demo.controllers;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.PartService;
import com.example.demo.service.PartServiceImpl;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class BuyNowController {
    private ProductService productService;

    @Autowired
    public BuyNowController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/buyProduct")
    public String buyProduct(@RequestParam("productId") long productId, Model mode1) {
        boolean purchaseSuccess = productService.decrementInventory(productId);
        if (purchaseSuccess) {
            return "confirmationbuyproduct";
        }
        else {
            return "failurebuyproduct";
        }
    }
    @PostMapping("/buyProduct")
    public String postbuyProduct(@RequestParam("productId") long productId, Model mode1) {
        return "failurebuyproduct";

    }
}

