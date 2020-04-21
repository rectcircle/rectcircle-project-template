package cn.rectcircle.commontemplate.service;

import cn.rectcircle.commontemplate.dto.UserDTO;

/**
 * @author Rectcircle
 */
public interface UserService {
    UserDTO findByUsername(String username);

}
