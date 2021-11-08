package com.shekhargulati.ssoserver;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class UserController {

	@Autowired
	UserRepository userRepository;

	
    @GetMapping("/user/me")
    public Principal user(Principal principal) {
        return principal;
    }
    
    @GetMapping("/welcome")
    public String welcome()
    {
    	return "Hi you are successfully loged in";
    }
    
    @GetMapping("/signup")
	public String signup( @RequestParam("username") String username,
						  @RequestParam("password") String password,					  
						  @RequestParam("enabled") boolean enabled,
						  @RequestParam("authority") String authority
						)
	{
		
		userRepository.save(new User(username,password,enabled,authority));
		//authoritiesRepository.save(new Authorities(username,authority));
		//System.out.println("userName"+userName);
		return "User details have been successfully saved";
	}
}
