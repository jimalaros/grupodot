package grupodot.backend.dao;

import java.util.List;

import grupodot.backend.model.User;

public interface UserDao {
    public List <User> getAll();
    User save(User user);
    User obtainUser(User user);
}
