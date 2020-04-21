package cn.rectcircle.commontemplate.dto;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author Rectcircle
 */
public class UserDTO implements Serializable {

    private static final long serialVersionUID = -3540719040181282263L;

    private Long id;

    private String username;

    @JSONField(serialize = false)
    private String password;

    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDTO [email=" + email + ", id=" + id + ", password=" + password + ", username=" + username + "]";
    }

}
