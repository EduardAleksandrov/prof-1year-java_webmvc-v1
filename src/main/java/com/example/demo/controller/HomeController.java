package com.example.demo.controller;

import java.util.List;
import com.example.demo.model.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "homes"; // View name
    }

    @GetMapping("/welcome")
    public String showWelcomePage(Model model) {
        // 1. Create a User object
        User currentUser = new User();
        currentUser.setId(101L);
        currentUser.setName("Alex");
        currentUser.setEmail("alex@example.com");
        currentUser.setRole("ADMIN");
        currentUser.setActive(true);

        // 2. Create a List of Products
        List<Product> productList = Arrays.asList(
            new Product("Laptop", "$999.00"),
            new Product("Smartphone", "$599.00"),
            new Product("Headphones", "$150.00")
        );

        // 3. Add everything to the model
        model.addAttribute("title", "Spring Boot + Thymeleaf");
        model.addAttribute("user", currentUser);
        model.addAttribute("products", productList);

        // 4. Return the name of your HTML file (without .html)
        return "welcome"; 
    }

    @PostMapping("/update") // Этот путь совпадает с th:action
    public String processUpdate(@ModelAttribute User user) {
        // Здесь вы получаете данные из формы и сохраняете их в базу
        System.out.println("Обновляем пользователя: " + user.getName());
        
        return "homes"; // Переходим на страницу успеха
    }
}


