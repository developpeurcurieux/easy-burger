/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author testo
 */
@Controller
@RequestMapping(value="/carte")
public class MenuController {
    
    @RequestMapping(value="")
    public String carte(Map<String, Object> model) {
        return "carte";
    }
}