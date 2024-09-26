package com.vozlwl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
   @GetMapping("/hello")
   public String helloPage(Model model) {
      model.addAttribute("greeting", "Hs!");
      return "hello";
   }
}