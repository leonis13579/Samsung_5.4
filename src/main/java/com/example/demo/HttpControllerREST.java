package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class HttpControllerREST extends HttpServlet {
    @RequestMapping("/")
    public String index(HttpServletRequest request, HttpServletResponse response){
        if (request.getParameter("lastname") != null && request.getParameter("firstname") != null) {
            if (!request.getParameter("lastname").equals("") && !request.getParameter("firstname").equals("")){
                String lastname = request.getParameter("lastname");
                String firstname = request.getParameter("firstname");

                firstname = firstname.substring(0, 1);

                return lastname + " " + firstname + ".";
            } else {
                return "No POST data lastname or firstname";
            }
        } else {
            return "Not POST data";
        }
    }
}
