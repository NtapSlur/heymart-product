package heymart.heymartproduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class ProductController {
    @GetMapping("")
    public String mainPage(Model model) {
        return "MainPage";
    }
}
