package cn.rectcircle.commontemplate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

/**
 * @author Rectcircle
 */
@Entity
@Table(name = "user", indexes = { @Index(name = "UDX_EMAIL", columnList = "email", unique = true),
        @Index(name = "UDX_NAME", columnList = "username", unique = true) })
public class User extends BaseEntity {

    private static final long serialVersionUID = 7794243682926386270L;

    @Column(name = "username", nullable = false, columnDefinition = "varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci not null")
    private String username;

    @Column(name = "password", nullable = false, columnDefinition = "varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci not null")
    private String password;

    @Column(name = "email", nullable = false, columnDefinition = "varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci not null")
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [email=" + email + ", password=" + password + ", username=" + username + "]";
    }

}
