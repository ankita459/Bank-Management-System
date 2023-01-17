package com.axis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/transaction")
public class ShoppingController {
	
	@Autowired
    private RestTemplate template;

   @GetMapping("/type")
    public String greet() {
        //String url=" http://localhost:9091/api/shopping/greet";
        return "This is Saving Account";
    }

   @GetMapping("/status")
    public String status() {
     //String url = "http://localhost:9091/payNow/" + price;
    // String url= "http://localhost:9091/payment-provider/payNow/" + price;
	   return "This is Active Account";

   }
}
