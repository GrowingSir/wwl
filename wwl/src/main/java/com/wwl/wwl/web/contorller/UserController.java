package com.wwl.wwl.web.contorller;

import com.wwl.wwl.model.User;
import com.wwl.wwl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService UserService;
    @RequestMapping("/insert")
    public String  insert(String username,String password){
        UserService.insert(username,password);
        return "success";
    }
    @RequestMapping("/delete")
    public String delete(String username){
        UserService.delete(username);
        return "delete";
    }
    @RequestMapping("/update")
    public String update(String password,String username){
        UserService.update(password,username);
        return "update";
    }
    @RequestMapping("/select")
    public List<User> select(String username){
        return UserService.select(username);
    }

}
