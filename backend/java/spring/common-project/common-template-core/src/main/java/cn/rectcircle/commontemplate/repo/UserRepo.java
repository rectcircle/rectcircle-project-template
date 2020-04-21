package cn.rectcircle.commontemplate.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.rectcircle.commontemplate.entity.User;

/**
 * @author Rectcircle
 */
public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
