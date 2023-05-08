package com.example;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pokemonTool {
    @GetMapping("/pokeTool")
    public void init(HttpServletRequest request,
                     HttpServletResponse response){

    }

    @GetMapping("/createParty")
    public void createParty(HttpServletRequest request,
                            HttpServletResponse response){

    }
}
