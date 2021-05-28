package com.example.jenkinsdemo.Controller;/**
 * @author: weixiaobin
 * @Description: jfsd
 * @Date: 2021-05-28 11:31
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: jfsd
 * @author: weixiaobin
 * @create: 2021-05-28 11:31
 */
@Controller
@RequestMapping("/jenkins")
public class TestController {

    @GetMapping("/test")
    @ResponseBody
    public String test01() {
        return "jenkins 自动部署成功";
    }
}
