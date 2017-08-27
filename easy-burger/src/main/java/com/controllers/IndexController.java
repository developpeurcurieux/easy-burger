/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.controllers;

import com.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping(value="/")
public class IndexController {
    @Autowired
    private User user;

    @RequestMapping("") 
    public String index(Model model) {
        model.addAttribute("user", user);
        return "index";
    }
    
}
