package grupodot.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import grupodot.backend.model.User;
import grupodot.backend.dao.UserDao;

@Service
public class UserService {
    
    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }
    
    public List<User> getAll(){
        return userDao.getAll();
    }
    
    public User addUser(User user){
        user.setUserId(null);
        return userDao.save(user);
    }

}