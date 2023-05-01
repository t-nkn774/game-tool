package com.example;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pokemonTool {
    @GetMapping("/createParty")
    public void createParty(HttpServletResponse response){

    }
}
