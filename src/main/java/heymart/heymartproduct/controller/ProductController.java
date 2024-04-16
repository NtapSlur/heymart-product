package heymart.heymartproduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {
    @GetMapping("")
    public String mainPage() {
        return "MainPage";
    }
}
