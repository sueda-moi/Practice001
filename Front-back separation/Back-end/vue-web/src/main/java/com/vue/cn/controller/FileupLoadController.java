package com.vue.cn.controller;

import com.vue.cn.domin.ResponseBean;
import com.vue.cn.domin.StatusEnum;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class FileupLoadController {

    @PostMapping("upload")
    public ResponseEntity<ResponseBean> upload(HttpServletRequest request) throws IOException, ServletException {
        String realPath = request.getServletContext().getRealPath("/upload/");
        File file= new File(realPath);
        if (!file.exists()){
            file.mkdirs();
        }
        Part part = request.getPart("head");
        //获得上传文件的后缀名 使用stringUtils 这个类导入的是spring下的util包下的
        String filenameExtension = StringUtils.getFilenameExtension(part.getSubmittedFileName());
        //重命名
        String filename = UUID.randomUUID().toString() + "." + filenameExtension;
        part.write(realPath+filename);
        return ResponseEntity.ok(new ResponseBean(StatusEnum.OK,
                "http://localhost:8080/upload/"+filename));

    }
}
