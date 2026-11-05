package com.billing.gst.Controller;

import com.billing.gst.Model.*;
import com.billing.gst.Repository.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/user")
public class UserController 
{


@PostMapping("/addUser")
public String addUser(@RequestBody AppUser user)
{return UserRepo.addAppUser(user);
}


@PostMapping("/addOrg")
public String addOrg(@RequestBody Org org)
{
return UserRepo.addOrg(org);
}
    
}
