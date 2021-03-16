package com.example.demo.controllers;

import com.example.demo.models.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class ClienteController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/listar")
    public String listar(Model model){
        model.addAttribute("titulo" , "Listado de usuarios");
        model.addAttribute("usuarios" , userDao.findAll());
        return "listar";
    }
}
