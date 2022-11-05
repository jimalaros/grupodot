package grupodot.backend.util;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import grupodot.backend.model.User;
import grupodot.backend.service.UserService;

@Component
public class Users {
    private final UserService userService;

    public Users(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void init(){
        User user = new User("user@gmail.com","123456");
        userService.addUser(user);
    }
}
