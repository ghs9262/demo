package com.example.demo;

import com.example.demo.dao.CapRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CapRoleController {

    @Autowired
    private CapRoleMapper capRoleMapper;


    @RequestMapping
    public String queryCapRole(Model model){
        model.addAttribute("roles", capRoleMapper.selectByPrimaryKey("1"));
        return  "cap_role";
    }
}
