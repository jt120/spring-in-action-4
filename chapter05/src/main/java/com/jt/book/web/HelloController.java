package com.jt.book.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author he
 * @since 2015/2/16
 */
@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("name", "zhangsan");
        return "home";
    }
}
