package com.jayinc.SpringBootWeb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public  String home() {
        System.out.println("home() called...");
        return "index";
    }

    // Servlet way of doing
//    @RequestMapping("add")
//    public  String add(HttpServletRequest req, HttpSession session) {
//        System.out.println("add() called...");
//        var num1= Integer.parseInt(req.getParameter("num1"));
//        var num2= Integer.parseInt(req.getParameter("num2"));
//        var result = num1 + num2;
//
//        session.setAttribute("num1", num1);
//        session.setAttribute("num2", num2);
//        session.setAttribute("result", result);
//        System.out.println(result);
//        return "result.jsp";
//    }

//    When you send a request for the add method, with the SAME  name as that of the parameter.
//    @RequestParam("num1") is optional if you use the same name
//    @RequestMapping("add")
//    public  String add(@RequestParam("num1") int num1 , @RequestParam("num2")int num2, HttpSession session) {
//        System.out.println("add() called...");
//
//        var result = num1 + num2;
//
//        session.setAttribute("num1", num1);
//        session.setAttribute("num2", num2);
//        session.setAttribute("result", result);
//        System.out.println(result);
//        return "result.jsp";
//    }

// Using model instead of session.

//    @RequestMapping("add")
//    public  String add(@RequestParam("num1") int num1 , @RequestParam("num2")int num2, Model model) {
//        System.out.println("add() called...");
//
//        var result = num1 + num2;
//
//        model.addAttribute("num1", num1);
//        model.addAttribute("num2", num2);
//        model.addAttribute("result", result);
//
//        System.out.println(result);
//        return "result";
//    }


//    Using ModelAndView object
    @RequestMapping("add")
    public  ModelAndView add(@RequestParam("num1") int num1 , @RequestParam("num2")int num2, ModelAndView mv) {
        System.out.println("add() called...");

        var result = num1 + num2;

        mv.addObject("num1", num1);
        mv.addObject("num2", num2);
        mv.addObject("result", result);
        mv.setViewName("result");

        System.out.println(result);
        return mv;
    }
}
