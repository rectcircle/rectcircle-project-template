package cn.rectcircle.commontemplate.util;

import org.springframework.beans.BeanUtils;

import cn.rectcircle.commontemplate.dto.UserDTO;
import cn.rectcircle.commontemplate.entity.User;

/**
 * @author Rectcircle
 */
public class EntityUtils {
    public static UserDTO userE2D(User user) {
        UserDTO target = new UserDTO();
        BeanUtils.copyProperties(user, target);
        return target;
    }
}
