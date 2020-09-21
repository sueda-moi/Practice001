package com.vue.cn.utils;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;


public class SendSmsUtils {

    public static  void  sendSms(String phone,String code){
        DefaultProfile profile = DefaultProfile.getProfile("cn‐hangzhou",
                "LTAI4Fmb3piHsLoJ1MeCfDZe",
                "OhBa8sif6WzLAQKY13o6R9WfBQADrj");
        IAcsClient client = new DefaultAcsClient(profile);
        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn‐hangzhou");
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", "尚马十九期辉哥");
        request.putQueryParameter("TemplateCode", "SMS_183240934");
        request.putQueryParameter("TemplateParam", "{\"code\":\""+code+"\"}");

        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData()); }
        catch (ClientException e) {
            e.printStackTrace(); }


    }

}
