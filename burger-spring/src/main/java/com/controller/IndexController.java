/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;
import com.model.GestionUser;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
//@RequestMapping(value="/")
public class IndexController {
    @Autowired
    GestionUser gestionUser;
    
    
    @RequestMapping(value="")
	public String index(Model model) {
             model.addAttribute("user", new User());
            return "index";
	}
        
        @RequestMapping(value="/contact-us")
        public String home(@ModelAttribute User user, Model model) {
            gestionUser.setUser(user);
            if(gestionUser.checkMdp()) {
                return "home";
            }
            else {
                model.addAttribute("gestionUser", gestionUser);
                return "index";
            }
        }
        
    
}