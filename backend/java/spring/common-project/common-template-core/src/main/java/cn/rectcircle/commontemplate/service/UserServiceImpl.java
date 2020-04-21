package cn.rectcircle.commontemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.rectcircle.commontemplate.dto.UserDTO;
import cn.rectcircle.commontemplate.repo.UserRepo;
import cn.rectcircle.commontemplate.util.EntityUtils;

/**
 * @author Rectcircle
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDTO findByUsername(String name) {
        return userRepo.findByUsername(name).map(EntityUtils::userE2D).orElse(null);
    }
}
