package grupodot.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import grupodot.backend.dao.UserDao;
import grupodot.backend.model.User;
import grupodot.backend.util.JWTUtil;

@RestController
@RequestMapping({"/auth"})
public class AuthController {

    @Autowired(required = true)
    private JWTUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        String tokenJwt = jwtUtil.create(String.valueOf(user.getUserId()), user.getEmail());
        return tokenJwt;
    }
}
