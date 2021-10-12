package com.zhou.testareo.controller;

import com.zhou.testareo.pojo.tbl_users;
import com.zhou.testareo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    IUserService iUserService;

    @RequestMapping("/users")
    public String all(Model model){
        List<tbl_users> users = iUserService.queryUserList();
        model.addAttribute("users",users);
        return "list";
    }
    @GetMapping("/user")
    public String toAddPage(Model model){
        return "add";
    }
    @RequestMapping("/user")
    public String addUser(tbl_users user){
        iUserService.addUser(user);
        return "redirect:users";
    }
//    @GetMapping("/users/{id}")
//    @ResponseBody
//    public tbl_users queryUserById(String id){
//        return iUserService.queryUserById(id);
//    }

    @GetMapping(value = "delete/{id}")
    public String delete(@PathVariable("id")String id){
        iUserService.deleteUser(id);
        return "redirect:users";
    }
    @PostMapping("/updateUser")
    public String updateUser(tbl_users user){
        iUserService.updateUser(user);
        return "redirect:users";
    }

    @RequestMapping("/getUsers")
    @ResponseBody
    public List<tbl_users> getAllUsers() {

        List<tbl_users> users = iUserService.queryUserList();
        return users;
    }
//    @Autowired
//    private IUserService iUserService;
//
//    @GetMapping("/queryUserList")
//    public String all(Model model){
//        List<tbl_users> users = iUserService.queryUserList();
//        model.addAttribute("users",users);
//        return "users";
//    }
//    @GetMapping("/queryUser/{id}")
//    @ResponseBody
//    public tbl_users queryUserById(String id){
//        return iUserService.queryUserById(id);
//    }
////    @RequestMapping("/AddUser")
////    public ModelAndView AddUser(tbl_users users){
////        iUserService.addUser(users);
////        ModelAndView mav = new ModelAndView("redirect:/all");
////        return mav;
////    }
//    @RequestMapping("Add1")
//    public ModelAndView Add1() {
//        return new ModelAndView("add");
//    }
//
//    @RequestMapping("/addUser")
//    public ModelAndView addUser(){
//        iUserService.addUser(new tbl_users("zqy","123","wew",0));
//        ModelAndView mav = new ModelAndView("redirect:/all");
//        return mav;
//    }
//    @GetMapping(value = "delete/{id}")
//    public ModelAndView delete(String id){
//        iUserService.deleteUser(id);
//        ModelAndView mav = new ModelAndView("redirect:/all");
//        return mav;
//    }
//    @GetMapping("/updateUser")
//    public ModelAndView updateUser(){
//        iUserService.updateUser(new tbl_users("sxt","456","232",0));
//        ModelAndView mav = new ModelAndView("redirect:/all");
//        return mav;
//    }
}
