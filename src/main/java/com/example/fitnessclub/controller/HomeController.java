package com.example.fitnessclub.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {


    @GetMapping("/")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/sotr")
    public String sotr(Model model) {

        return "menusotr";
    }

    @GetMapping("/serv")
    public String services(Model model) {

        return "menuservices";
    }

    @GetMapping("/cl")
    public String client(Model model) {

        return "menuclient";
    }

    @GetMapping("/train")
    public String train(Model model) {

        return "menutrain";
    }

    @GetMapping("/export")
    public String export(Model model) {

        return "export";
    }

}
