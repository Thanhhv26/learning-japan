package vn.huvata.xyz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.huvata.xyz.domain.User;
import vn.huvata.xyz.service.UserService;

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
@CrossOrigin()
public class UserController {

    @Autowired
    private UserService userService;
    
    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @GetMapping(path = {"/{id}"})
    public User findOne(@PathVariable("id") int id){
        return userService.findById(id);
    }

    @PutMapping
    public User update(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping(path ={"/{id}"})
    public User delete(@PathVariable("id") int id) {
        return userService.delete(id);
    }

    @GetMapping
    public List<User> findAll(){
    	
    	User user = null;
    	for(int i = 0; i < 5; i++) {
    		user = new User();
    		user.setFirstName("Thành" + i);
    		user.setLastName("Huỳnh" + i);
    		user.setEmail("thanhhv26@gmail.com" + i);
    		userService.create(user);
    	}
    	
        return userService.findAll();
    }
}
