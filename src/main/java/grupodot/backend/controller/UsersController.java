package grupodot.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import grupodot.backend.service.UserService;
import grupodot.backend.model.User;

@RestController
@RequestMapping(value="/users")
public class UsersController {
    private final UserService userService;
    
    public UsersController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("")
    public List<User> getAll(){
        return userService.getAll();
    }
}
