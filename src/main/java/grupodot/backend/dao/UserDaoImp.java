package grupodot.backend.dao;

import java.util.List;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

import grupodot.backend.model.User;
import java.util.ArrayList;

@Repository
public class UserDaoImp implements UserDao {

    private final Map<String, User> usersMap = new HashMap<>();
    
    @Override
    public List<User> getAll() {
        List<User> list = new ArrayList<>();
        list.addAll(usersMap.values());
        return list;
    }
    
    @Override
    public User save(User user) {
        if(user.getUserId() == null){
            user.setUserId(String.valueOf(System.currentTimeMillis()));
        }
        return usersMap.put(user.getUserId(), user);
    }
    
    @Override
    public User obtainUser(User user) {
        if (!user.getEmail().isEmpty()) {
            return null;
        }

        String passwordHashed = user.getPassword();

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        if (argon2.verify(passwordHashed, user.getPassword())) {
            return user;
        }
        return null;
    }
}
