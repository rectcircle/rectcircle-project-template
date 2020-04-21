package cn.rectcircle.commontemplate.controller;

import com.alibaba.fastjson.JSON;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.rectcircle.commontemplate.dto.ResponseDTO;

/**
 * @author Rectcircle
 */
@RestController
@RequestMapping("/api/v1/lab")
public class LabController {

    /**
     * 测试JSON配置
     */
    @GetMapping("/json")
    public ResponseDTO<Long> json() {
        var resp = ResponseDTO.success(1L);
        System.out.println(JSON.toJSONString(resp));
        return resp;
    }

}
