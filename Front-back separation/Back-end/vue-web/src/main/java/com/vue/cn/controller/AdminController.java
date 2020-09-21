package com.vue.cn.controller;


import com.vue.cn.domin.Admin;
import com.vue.cn.domin.StatusEnum;
import com.vue.cn.domin.StatusResponse;
import com.vue.cn.service.AdminService;
import com.vue.cn.utils.SendSmsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("sendCode")
    public ResponseEntity sendCode(String phone){
        Admin admin = adminService.selectByPhone(phone);
        if (admin!=null){
            //既是数据库对上了 要发送手机验证码
            //随机验证码
            String code = UUID.randomUUID().toString().substring(0, 6);
            SendSmsUtils.sendSms(phone,code);

            return  ResponseEntity.ok(new StatusResponse(StatusEnum.OK));

        }else {
            //数据库对不上
            System.out.println("おわた");
        }
        return null;
    }

}
