package com.itshaala.controller;

import com.itshaala.dto.StudentRequestDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientController {

    @RequestMapping("/student/{student_id}")
    public ModelAndView getStudentById(@PathVariable("student_id") int studentId) {
        ModelAndView mav = new ModelAndView("student");
        mav.addObject("student", "Welcome student = " + studentId);
        return mav;
    }

    //http://localhost:8080/spring_mvc_002_controller_client_war/branch?name=deccan&location=pune
    @RequestMapping("/branch")
    public ModelAndView getBranchByNameAndLocation(
            @RequestParam("name") String branchName,
            @RequestParam("location") String location) {
        ModelAndView mav = new ModelAndView("branch");
        mav.addObject("branch", "Branch details = " + branchName + "\t" + location);
        return mav;
    }

    @GetMapping("/register-form")
    public String registerForm() {
        return "register-form";
    }

    /*@GetMapping("/register")
    public ModelAndView register(@RequestParam("email") String email,
                                 @RequestParam("psw") String password,
                                 @RequestParam("psw-repeat") String passwordRepeat) {

        ModelAndView mav = new ModelAndView("register");
        mav.addObject("email", email);
        mav.addObject("password", password);
        mav.addObject("passwordRepeat", passwordRepeat);
        return mav;
    }*/

     @GetMapping("/register")
    public ModelAndView register(@ModelAttribute StudentRequestDto studentRequestDto) {

        ModelAndView mav = new ModelAndView("register");
        mav.addObject("email", studentRequestDto.getEmail());
        mav.addObject("password", studentRequestDto.getPsw());
        mav.addObject("passwordRepeat", studentRequestDto.getPsw_repeat());
        return mav;
    }

}
