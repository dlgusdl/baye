package shop.mtcoding.baye.controller;

import lombok.Getter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    @GetMapping({ "/", "/product" })
    public String home() {
        return "product/list";
    }
}
