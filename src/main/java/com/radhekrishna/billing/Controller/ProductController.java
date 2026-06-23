package com.radhekrishna.billing.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.radhekrishna.billing.Model.Product;
import com.radhekrishna.billing.Repository.ProductRepo;
import com.radhekrishna.billing.Security.jwtUtils;

import io.jsonwebtoken.Claims;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/products")
public class ProductController {

@PostMapping("/add")
public String addNewProduct(@RequestBody Product product,HttpServletRequest request)
{
String authHeader = request.getHeader("Authorization");
String token = authHeader.substring(7); // remove "Bearer "

Claims claims = jwtUtils.extractToken(token);

int userId = claims.get("user_id", Integer.class);

product.setUserId(userId);
ProductRepo.addProduct(product);
 return "Product Added";

}
}
