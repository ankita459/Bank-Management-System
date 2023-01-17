package com.axis.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.axis.model.Product;


@FeignClient(name="Transaction-Account-Service")
public interface ProductClient {
	
	@GetMapping("/api/v1/bank")
	List<Product> getAllProduct();

}
