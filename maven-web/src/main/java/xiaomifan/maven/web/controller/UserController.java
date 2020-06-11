package xiaomifan.maven.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xiaomifan.maven.pojo.User;
import xiaomifan.maven.services.Impl.UserServicesImpl;

/**
 * @author 小米饭
 * @date 2020/6/8
 * @descrition：xiaomifan.maven.web.controller
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServicesImpl userServicesImpl;

    @RequestMapping("addUser")
    public String addUser(User user){
         this.userServicesImpl.addUser(user);
         return "success";
    }
}
