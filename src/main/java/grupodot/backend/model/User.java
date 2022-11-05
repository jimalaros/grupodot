package grupodot.backend.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class User {
    private String userId;
    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
}
