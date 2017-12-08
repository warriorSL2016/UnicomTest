package com.sheng.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>类名</b>：HelloController<br>
 * <p><b>标题</b>： </p>
 * <p><b>描述</b>： </p>
 * <p><b>版权声明</b>：Copyright (c) 2017</p>
 * <p><b>公司</b>：联通支付有限公司 </p>
 *
 * @author <font color='blue'>shengl9@chinaunicom.cn </font>
 * @version 1.0
 * @date 2017/12/8 16:06
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(){
        return "receive your request , ok!!!";
    }
}
