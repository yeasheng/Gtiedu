package com.gti.gtiedu.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 注册相关控制器
 *
 * @author yansheng
 * @create 2018-09-25 20:08
 **/
@Controller
@RequestMapping("/home")
public class RegisterController {

    @RequestMapping("/register")
    public String registerPage(Model m){
        m.addAttribute("name", "thymeleaf");
        return "home/register";
    }
}
