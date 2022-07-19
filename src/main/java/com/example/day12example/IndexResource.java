package com.example.day12example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = {"/indexresource", "/indexresource.html"})       // refer to index resource by default
public class IndexResource {

    @GetMapping(produces = {"text/html"})
    public String index(Model model) {
        return "indexresource";     // must be double quote

    }
}
