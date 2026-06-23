package com.radhekrishna.billing.Controller;

import com.radhekrishna.billing.Model.User;
import com.radhekrishna.billing.Repository.UserRepo;
import com.radhekrishna.billing.Security.jwtUtils;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/user")
public class UserController {
   
@PostMapping("/register")
public String addUser(@RequestBody User user)
{if(!UserRepo.createUser(user))
    {return "User Not Created";}
 return "User Created";
}


@PostMapping("/login")
public String checkUser(@RequestBody User user) {
    User dbUser=UserRepo.checkLogin(user.getUsername(), user.getPassword());
    if(dbUser!=null)
        {
         String token=jwtUtils.generateToken(dbUser.getUsername(),dbUser.getUser_id());
         return token;
        }

    
       
    
    return "Invalid Credentials";

}
}
