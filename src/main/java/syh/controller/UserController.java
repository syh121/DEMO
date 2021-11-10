package syh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import syh.entity.User;
import syh.service.UserService;

import java.util.List;

/**
 * @author SYH
 * @create 2021-10-26 11:54
 */
@Controller
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("/tt")
    @ResponseBody
    public List<User> test(){
        return service.getAll();
    }

    @GetMapping("/hh")
    public String hh(){
        return "hello";
    }
}
